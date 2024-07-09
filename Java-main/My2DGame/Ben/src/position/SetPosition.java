package position;

import tile.Tile;
import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;

public class SetPosition {

    int team1Unit1BaseX = 96; // Basis-X-Position
    int team1Unit1BaseY = 336; // Basis-Y-Position

    int team1Unit2BaseX = 48; // Basis-X-Position
    int team1Unit2BaseY = 384; // Basis-Y-Position
    
    int team1Unit3BaseX = 96; // Basis-X-Position
    int team1Unit3BaseY = 432; // Basis-Y-Position
    
    int team1Unit4BaseX = 144; // Basis-X-Position
    int team1Unit4BaseY = 384; // Basis-Y-Position
    
    int team2Unit1BaseX = 768; // Basis-X-Position
    int team2Unit1BaseY = 96; // Basis-Y-Position

    int team2Unit2BaseX = 720; // Basis-X-Position
    int team2Unit2BaseY = 144; // Basis-Y-Position

    int team2Unit3BaseX = 768; // Basis-X-Position
    int team2Unit3BaseY = 192; // Basis-Y-Position

    int team2Unit4BaseX = 816; // Basis-X-Position
    int team2Unit4BaseY = 144; // Basis-Y-Position
 

    public static int team1Unit1AusPosX;
    public static int team1Unit1AusPosY;
    public static int team1Unit2AusPosX;
    public static int team1Unit2AusPosY;
    public static int team1Unit3AusPosX;
    public static int team1Unit3AusPosY;
    public static int team1Unit4AusPosX;
    public static int team1Unit4AusPosY;

    public static int team2Unit1AusPosX;
    public static int team2Unit1AusPosY;
    public static int team2Unit2AusPosX;
    public static int team2Unit2AusPosY;
    public static int team2Unit3AusPosX;
    public static int team2Unit3AusPosY;
    public static int team2Unit4AusPosX;
    public static int team2Unit4AusPosY;


    int xMove = 0; // Verschiebung in X-Richtung
    int yMove = 0; // Verschiebung in Y-Richtung

    GamePanel gp;
    Tile[] tile;

    public SetPosition(String input, GamePanel gp) {
        this.gp = gp;
       

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
        int team1Unit1AusPosX = team1Unit1BaseX + xMove;
        int team1Unit1BasePosX = team1Unit1AusPosX;
        System.out.println(xMove);
        System.out.println(team1Unit1AusPosX);
        System.out.println(team1Unit1BaseX);
        int team1Unit1AusPosY = team1Unit1BaseY + yMove;
        int team1Unit1BasePosY = team1Unit1AusPosY;
        int team1Unit2AusPosX = team1Unit2BaseX + xMove;
        int team1Unit2BasePosX = team1Unit2AusPosX;
        int team1Unit2AusPosY = team1Unit2BaseY + yMove;
        int team1Unit2BasePosY = team1Unit2AusPosY;
        int team1Unit3AusPosX = team1Unit1BaseX + xMove;
        int team1Unit3BasePosX = team1Unit1AusPosX;
        int team1Unit3AusPosY = team1Unit3BaseY + yMove;
        int team1Unit3BasePosY = team1Unit3AusPosY;
        int team1Unit4AusPosX = team1Unit4BaseX + xMove;
        int team1Unit4BasePosX  = team1Unit4AusPosX;
        int team1Unit4AusPosY = team1Unit4BaseY + yMove;
        int team1Unit4BasePosY = team1Unit4AusPosY;
        int team2Unit1AusPosX = team2Unit1BaseX + xMove;
        int team2Unit1BasePosX = team2Unit1AusPosX;
        int team2Unit1AusPosY = team2Unit1BaseY + yMove;
        int team2Unit1BasePosY = team2Unit1AusPosY;
        int team2Unit2AusPosX = team2Unit2BaseX + xMove;
        int team2Unit2BasePosX = team2Unit2AusPosX;
        int team2Unit2AusPosY = team2Unit2BaseY + yMove;
        int team2Unit2BasePosY = team2Unit2AusPosY;
        int team2Unit3AusPosX = team2Unit3BaseX + xMove;
        int team2Unit3BasePosX = team2Unit3AusPosX;
        int team2Unit3AusPosY = team2Unit3BaseY + yMove;
        int team2Unit3BasePosY = team2Unit3AusPosY;
        int team2Unit4AusPosX = team2Unit4BaseX + xMove;
        int team2Unit4BasePosX = team2Unit4AusPosX;
        int team2Unit4AusPosY = team2Unit4BaseY + yMove;
        int team2Unit4BasePosY = team2Unit4AusPosY;
    }
    public void drawUnits(Graphics2D g2) {}
}



