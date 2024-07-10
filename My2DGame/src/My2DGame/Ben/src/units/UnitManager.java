package units;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import main.GamePanel;
import position.SetPosition;
import tile.Tile;
import calculator.UnitRandomieser;

public class UnitManager{ 
    
    GamePanel gp;
    Tile[] tile;
    
    public UnitManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[40];
        getTileImage();
    }

    public void getTileImage() {
        try {
            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/LandUnits/infantry/infantryRed.png"));
            
            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/LandUnits/infantry/infantryBlue.png"));
            
            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/LandUnits/mech/mechRed.png"));
            
            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/LandUnits/mech/mechBlue.png"));
            
            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/LandUnits/artillery/artilleryRed.png"));
            
            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/LandUnits/artillery/artilleryBlue.png"));
            
            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/LandUnits/antiAir/antiAirRed.png"));
            
            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/LandUnits/antiAir/antiAirBlue.png"));
            
            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/LandUnits/tank/tankRed.png"));
            
            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/LandUnits/tank/tankBlue.png"));
            
            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/AirUnits/bCopter/bCopterRed.png"));
            
            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/AirUnits/bCopter/bCopterBlue.png"));
            
            tile[32] = new Tile();
            tile[32].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/AirUnits/bomber/bomberRed.png"));
            
            tile[33] = new Tile();
            tile[33].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/AirUnits/bomber/bomberBlue.png"));
            
            tile[34] = new Tile();
            tile[34].image = ImageIO.read(getClass().getResourceAsStream("/res/units/red/AirUnits/fighter/fighterRed.png"));
            
            tile[35] = new Tile();
            tile[35].image = ImageIO.read(getClass().getResourceAsStream("/res/units/blue/AirUnits/fighter/fighterBlue.png"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

                     
    
     public void draw(Graphics2D g2) {
         Random rand = new Random();
        // Generiere 4 gerade Zahlen // 20, 22, 24, 26, 28, 30, 32, 34
        
            int even1 = 20 + 2 * rand.nextInt(8); 
            int even2 = 20 + 2 * rand.nextInt(8);
            int even3 = 20 + 2 * rand.nextInt(8);
            int even4 = 20 + 2 * rand.nextInt(8);
            // Generiere 4 ungerade Zahlen // 21, 23, 25, 27, 29, 31, 33, 35
            int odd1 = even1 + 1;                 
            int odd2 = even2 + 1;
            int odd3 = even3 + 1;
            int odd4 = even4 + 1;
        
            g2.drawImage(tile[even1].image, SetPosition.team1Unit1BaseX, SetPosition.team1Unit1BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[even2].image, SetPosition.team1Unit2BaseX, SetPosition.team1Unit2BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[even3].image, SetPosition.team1Unit3BaseX, SetPosition.team1Unit3BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[even4].image, SetPosition.team1Unit4BaseX, SetPosition.team1Unit4BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[odd1].image, SetPosition.team2Unit1BaseX, SetPosition.team2Unit1BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[odd2].image, SetPosition.team2Unit2BaseX, SetPosition.team2Unit2BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[odd3].image, SetPosition.team2Unit3BaseX, SetPosition.team2Unit3BaseY, gp.tileSize, gp.tileSize, null);
            g2.drawImage(tile[odd4].image, SetPosition.team2Unit4BaseX, SetPosition.team2Unit4BaseY, gp.tileSize, gp.tileSize, null);
           
        }   
}


