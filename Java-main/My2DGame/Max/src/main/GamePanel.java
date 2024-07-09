/*package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import position.SetPosition;
import tile.Tile;
import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

    // Screen settings
    final int originalTileSize = 8; // 16x16
    final int scale = 6;

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
    Image unitImage;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

        // Lade das Bild
        try {
            playerImage = ImageIO.read(getClass().getResourceAsStream("/res/cursor/player.png"));
            unitImage = ImageIO.read(getClass().getResourceAsStream("/res/cursor/player.png"));
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



public class SetPosition {

    int Team1Unit1baseX = 96; // Basis-X-Position
    int Team1Unit1baseY = 288; // Basis-Y-Position

    int Team1Unit2baseX = 48; // Basis-X-Position
    int Team1Unit2baseY = 336; // Basis-Y-Position

    int Team1Unit3baseX = 0; // Basis-X-Position
    int Team1Unit3baseY = 384; // Basis-Y-Position

    int Team1Unit4baseX = 144; // Basis-X-Position
    int Team1Unit4baseY = 336; // Basis-Y-Position

    int xMove = 0; // Verschiebung in X-Richtung
    int yMove = 0; // Verschiebung in Y-Richtung

    int unit1Xpos;
    int unit1Ypos;
    int unit2Xpos;
    int unit2Ypos;
    int unit3Xpos;
    int unit3Ypos;
    int unit4Xpos;
    int unit4Ypos;

    GamePanel gp;
    Tile[] tile;

    public SetPosition(String input, GamePanel gp) {
        this.gp = gp;
        tile = new Tile[20];
        getTileImage();

        // Hier setzt du xMove und yMove entsprechend der Bedingungen
        if (input.equals("w")) {
            yMove = -48;
        } else if (input.equals("s")) {
            yMove = 48;
        } else if (input.equals("a")) {
            xMove = -48;
        } else if (input.equals("d")) {
            xMove = 48;
        }

        unit1Xpos = Team1Unit1baseX + xMove;
        unit1Ypos = Team1Unit1baseY + yMove;

        unit2Xpos = Team1Unit2baseX + xMove;
        unit2Ypos = Team1Unit2baseY + yMove;

        unit3Xpos = Team1Unit3baseX + xMove;
        unit3Ypos = Team1Unit3baseY + yMove;

        unit4Xpos = Team1Unit4baseX + xMove;
        unit4Ypos = Team1Unit4baseY + yMove;


        
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
       // Zeichne die Units
       g2.drawImage(unitImage,unit1Xpos, unit1Ypos, tileSize, tileSize, null);

        g2.dispose();
    
    }
}
*/

package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import position.SetPosition;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

    // Screen settings
    final int originalTileSize = 8; // 16x16
    final int scale = 6;

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

    SetPosition setPosition;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

        // Lade das Bild
        try {
            playerImage = ImageIO.read(getClass().getResourceAsStream("/res/cursor/player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Initialize SetPosition with a default input
        setPosition = new SetPosition("w", this);
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
                setPosition = new SetPosition("w", this);
            }
            if (keyH.downPressed) {
                playerY += playerSpeed;
                setPosition = new SetPosition("s", this);
            }
            if (keyH.leftPressed) {
                playerX -= playerSpeed;
                setPosition = new SetPosition("a", this);
            }
            if (keyH.rightPressed) {
                playerX += playerSpeed;
                setPosition = new SetPosition("d", this);
            }
            lastMoveTime = currentTime;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        // Draw tiles
        tileM.draw(g2);
        // Draw player
        if (playerImage != null) {
            g2.drawImage(playerImage, playerX, playerY, tileSize, tileSize, null);
        } else {
            // Fallback, falls das Bild nicht geladen werden konnte
            g2.fillRect(playerX, playerY, tileSize, tileSize);
        }
        // Draw units
        setPosition.drawUnits(g2);

        g2.dispose();
    }
}