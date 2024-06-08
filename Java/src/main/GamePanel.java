package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

    // Screen settings
    final int originalTileSize = 16; // 16x16
    final int scale = 5;

    public final int tileSize = originalTileSize * scale; // 80x80
    final int maxScreenCol = 19;
    final int maxScreenRow = 10;
    final int screenWidth = tileSize * maxScreenCol; // 1520px
    final int screenHeight = tileSize * maxScreenRow; // 800px

    // FPS
    int FPS = 60;

    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;

    // Standardwerte
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = tileSize; // Bewegt sich um ein Tile pro Sekunde

    // Timer für Spielerbewegung
    long lastMoveTime = 0;
    long moveInterval = 250000000L; // 1 Sekunde in Nanosekunden

    // Bild für den Spieler
    Image playerImage;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

        // Lade das Bild
        try {
            playerImage = ImageIO.read(getClass().getResourceAsStream("/res/cursors/player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {
        long currentTime = System.nanoTime();
        if (currentTime - lastMoveTime >= moveInterval) {
            if (keyH.upPressed) {
                playerY -= playerSpeed;
            }
            if (keyH.downPressed) {
                playerY += playerSpeed;
            }
            if (keyH.leftPressed) {
                playerX -= playerSpeed;
            }
            if (keyH.rightPressed) {
                playerX += playerSpeed;
            }
            lastMoveTime = currentTime;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        //tiles müssen vor Player gemacht sein sonst ist auswahl hinter den tiles!!!
        tileM.draw(g2);
        // Zeichne das Bild des Spielers
        if (playerImage != null) {
            g2.drawImage(playerImage, playerX, playerY, tileSize, tileSize, null);
        } else {
            // Fallback, falls das Bild nicht geladen werden konnte
            g2.fillRect(playerX, playerY, tileSize, tileSize);
        }

        g2.dispose();
    }
}