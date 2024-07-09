package tile;

import java.awt.Graphics2D;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import main.GamePanel;
import position.SetPosition;

public class TileManager{ 

    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[40];
        getTileImage();
    }

    public void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water1.png"));
            
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/water2.png"));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffBottom.png"));
            
            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffBottomLeft.png"));
                        
            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffBottomRight.png"));
                        
            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffTop.png"));

            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffTopLeft.png"));

            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffTopRight.png"));

            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffLeft.png"));

            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/cliffRight.png"));

            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass.png"));

            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/forest.png"));

            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/island.png"));

            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/redBottomBuilding.png"));
            
            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/redTopBuilding1.png"));
            
            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/redTopBuilding2.png"));

            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetSide.png"));

            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetTopLeft.png"));

            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetDownRight.png"));

            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetSide.png"));

            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetTopLeft.png"));

            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetDownRight.png"));

            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetSide.png"));

            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetTopLeft.png"));

            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/streetDownRight.png"));

            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/street.jpg"));
            
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
        //////////////////////////erste reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
        int x0_y0 = 0;
        g2.drawImage(tile[0].image, 48, 0, gp.tileSize, gp.tileSize, null);
        int x1_y0 = 0;
        g2.drawImage(tile[0].image, 96, 0, gp.tileSize, gp.tileSize, null);
        int x2_y0 = 0;
        g2.drawImage(tile[0].image, 144, 0, gp.tileSize, gp.tileSize, null);
        int x3_y0 = 0;
        g2.drawImage(tile[0].image, 192, 0, gp.tileSize, gp.tileSize, null);
        int x4_y0 = 0;
        g2.drawImage(tile[0].image, 240, 0, gp.tileSize, gp.tileSize, null);
        int x5_y0 = 0;
        g2.drawImage(tile[0].image, 288, 0, gp.tileSize, gp.tileSize, null);
        int x6_y0 = 0;
        g2.drawImage(tile[0].image, 336, 0, gp.tileSize, gp.tileSize, null);
        int x7_y0 = 0;
        g2.drawImage(tile[0].image, 384, 0, gp.tileSize, gp.tileSize, null);
        int x8_y0 = 0;
        g2.drawImage(tile[0].image, 432, 0, gp.tileSize, gp.tileSize, null);
        int x9_y0 = 0;
        g2.drawImage(tile[0].image, 480, 0, gp.tileSize, gp.tileSize, null);
        int x10_y0 = 0;
        g2.drawImage(tile[0].image, 528, 0, gp.tileSize, gp.tileSize, null);
        int x11_y0 = 0;
        g2.drawImage(tile[0].image, 576, 0, gp.tileSize, gp.tileSize, null);
        int x12_y0 = 0;
        g2.drawImage(tile[2].image, 624, 0, gp.tileSize, gp.tileSize, null);
        int x13_y0 = 2;
        g2.drawImage(tile[2].image, 672, 0, gp.tileSize, gp.tileSize, null);
        int x14_y0 = 2;
        g2.drawImage(tile[2].image, 720, 0, gp.tileSize, gp.tileSize, null);
        int x15_y0 = 2;
        g2.drawImage(tile[2].image, 768, 0, gp.tileSize, gp.tileSize, null);
        int x16_y0 = 2;
        g2.drawImage(tile[2].image, 816, 0, gp.tileSize, gp.tileSize, null);
        int x17_y0 = 2;
        g2.drawImage(tile[0].image, 864, 0, gp.tileSize, gp.tileSize, null);
        int x18_y0 = 0;

        //////////////////////////zweite reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 48, gp.tileSize, gp.tileSize, null);
        int x0_y1 = 0;
        g2.drawImage(tile[0].image, 48, 48, gp.tileSize, gp.tileSize, null);
        int x1_y1 = 0;
        g2.drawImage(tile[0].image, 96, 48, gp.tileSize, gp.tileSize, null);
        int x2_y1 = 0;
        g2.drawImage(tile[0].image, 144, 48, gp.tileSize, gp.tileSize, null);
        int x3_y1 = 0;
        g2.drawImage(tile[0].image, 192, 48, gp.tileSize, gp.tileSize, null);
        int x4_y1 = 0;
        g2.drawImage(tile[0].image, 240, 48, gp.tileSize, gp.tileSize, null);
        int x5_y1 = 0;
        g2.drawImage(tile[0].image, 288, 48, gp.tileSize, gp.tileSize, null);
        int x6_y1 = 0;
        g2.drawImage(tile[0].image, 336, 48, gp.tileSize, gp.tileSize, null);
        int x7_y1 = 0;
        g2.drawImage(tile[0].image, 384, 48, gp.tileSize, gp.tileSize, null);
        int x8_y1 = 0;
        g2.drawImage(tile[2].image, 432, 48, gp.tileSize, gp.tileSize, null);
        int x9_y1 = 2;
        g2.drawImage(tile[2].image, 480, 48, gp.tileSize, gp.tileSize, null);
        int x10_y1 = 2;
        g2.drawImage(tile[2].image, 528, 48, gp.tileSize, gp.tileSize, null);
        int x11_y1 = 2;
        g2.drawImage(tile[4].image, 576, 48, gp.tileSize, gp.tileSize, null);
        int x12_y1 = 4;
        g2.drawImage(tile[11].image, 624, 48, gp.tileSize, gp.tileSize, null);
        int x13_y1 = 11;
        g2.drawImage(tile[10].image, 672, 48, gp.tileSize, gp.tileSize, null);
        int x14_y1 = 10;
        g2.drawImage(tile[11].image, 720, 48, gp.tileSize, gp.tileSize, null);
        int x15_y1 = 11;
        g2.drawImage(tile[15].image, 768, 48, gp.tileSize, gp.tileSize, null);
        int x16_y1 = 15;
        g2.drawImage(tile[11].image, 816, 48, gp.tileSize, gp.tileSize, null);
        int x17_y1 = 11;
        g2.drawImage(tile[8].image, 864, 48, gp.tileSize, gp.tileSize, null);
        int x18_y1 = 8;
        

        ///////////////////////////////dritte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 96, gp.tileSize, gp.tileSize, null);
        int x0_y3 = 0;
        g2.drawImage(tile[0].image, 48, 96, gp.tileSize, gp.tileSize, null);
        int x1_y3 = 0;
        g2.drawImage(tile[12].image, 96, 96, gp.tileSize, gp.tileSize, null);
        int x2_y3 = 12;
        g2.drawImage(tile[0].image, 144, 96, gp.tileSize, gp.tileSize, null);
        int x3_y3 = 0;
        g2.drawImage(tile[0].image, 192, 96, gp.tileSize, gp.tileSize, null);
        int x4_y3 = 0;
        g2.drawImage(tile[0].image, 240, 96, gp.tileSize, gp.tileSize, null);
        int x5_y3 = 0;
        g2.drawImage(tile[0].image, 288, 96, gp.tileSize, gp.tileSize, null);
        int x6_y3 = 0;
        g2.drawImage(tile[0].image, 336, 96, gp.tileSize, gp.tileSize, null);
        int x7_y3 = 0;
        g2.drawImage(tile[4].image, 384, 96, gp.tileSize, gp.tileSize, null);
        int x8_y3 = 2;
        g2.drawImage(tile[18].image, 432, 96, gp.tileSize, gp.tileSize, null);
        int x9_y3 = 18;
        g2.drawImage(tile[16].image, 480, 96, gp.tileSize, gp.tileSize, null);
        int x10_y3 = 16;
        g2.drawImage(tile[16].image, 528, 96, gp.tileSize, gp.tileSize, null);
        int x11_y3 = 16;
        g2.drawImage(tile[16].image, 576, 96, gp.tileSize, gp.tileSize, null);
        int x12_y3 = 16;
        g2.drawImage(tile[16].image, 624, 96, gp.tileSize, gp.tileSize, null);
        int x13_y3 = 16;
        g2.drawImage(tile[16].image, 672, 96, gp.tileSize, gp.tileSize, null);
        int x14_y3 = 16;
        g2.drawImage(tile[16].image, 720, 96, gp.tileSize, gp.tileSize, null);
        int x15_y3 = 16;
        g2.drawImage(tile[13].image, 768, 96, gp.tileSize, gp.tileSize, null);
        int x16_y3 = 13;
        g2.drawImage(tile[10].image, 816, 96, gp.tileSize, gp.tileSize, null);
        int x17_y3 = 10;
        g2.drawImage(tile[8].image, 864, 96, gp.tileSize, gp.tileSize, null);
        int x18_y3 = 8;

        //////////////////////////////vierte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 144, gp.tileSize, gp.tileSize, null);
        int x0_y4 = 0;
        g2.drawImage(tile[0].image, 48, 144, gp.tileSize, gp.tileSize, null);
        int x1_y4 = 0;
        g2.drawImage(tile[0].image, 96, 144, gp.tileSize, gp.tileSize, null);
        int x2_y4 = 0;
        g2.drawImage(tile[0].image, 144, 144, gp.tileSize, gp.tileSize, null);
        int x3_y4 = 0;
        g2.drawImage(tile[0].image, 192, 144, gp.tileSize, gp.tileSize, null);
        int x4_y4 = 0;
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        int x5_y4 = 2;
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        int x6_y4 = 2;
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        int x7_y4 = 4;
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        int x8_y4 = 10;
        g2.drawImage(tile[19].image, 432, 144, gp.tileSize, gp.tileSize, null);
        int x9_y4 = 19;
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        int x10_y4 = 10;
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        int x11_y4 = 10;
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        int x12_y4 = 10;
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        int x13_y4 = 10;
        g2.drawImage(tile[11].image, 672, 144, gp.tileSize, gp.tileSize, null);
        int x14_y4 = 11;
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        int x15_y4 = 10;
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        int x16_y4 = 10;
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        int x17_y4 = 10;
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);

        //////////////////////////////fünfte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 192, gp.tileSize, gp.tileSize, null);
        int x0_y5 = 0;
        g2.drawImage(tile[0].image, 48, 192, gp.tileSize, gp.tileSize, null);
        int x1_y5 = 0;
        g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
        int x2_y5 = 2;
        g2.drawImage(tile[2].image, 144, 192, gp.tileSize, gp.tileSize, null);
        int x3_y5 = 2;
        g2.drawImage(tile[4].image, 192, 192, gp.tileSize, gp.tileSize, null);
        int x4_y5 = 4;
        g2.drawImage(tile[10].image, 240, 192, gp.tileSize, gp.tileSize, null);
        int x5_y5 = 10;
        g2.drawImage(tile[10].image, 288, 192, gp.tileSize, gp.tileSize, null);
        int x6_y5 = 10;
        g2.drawImage(tile[10].image, 336, 192, gp.tileSize, gp.tileSize, null);
        int x7_y5 = 10;
        g2.drawImage(tile[11].image, 384, 192, gp.tileSize, gp.tileSize, null);
        int x8_y5 = 11;
        g2.drawImage(tile[19].image, 432, 192, gp.tileSize, gp.tileSize, null);
        int x9_y5 = 19;
        g2.drawImage(tile[10].image, 480, 192, gp.tileSize, gp.tileSize, null);
        int x10_y5 = 10;
        g2.drawImage(tile[10].image, 528, 192, gp.tileSize, gp.tileSize, null);
        int x11_y5 = 10;
        g2.drawImage(tile[10].image, 576, 192, gp.tileSize, gp.tileSize, null);
        int x12_y5 = 10;
        g2.drawImage(tile[10].image, 624, 192, gp.tileSize, gp.tileSize, null);
        int x13_y5 = 10;
        g2.drawImage(tile[10].image, 672, 192, gp.tileSize, gp.tileSize, null);
        int x14_y5 = 10;
        g2.drawImage(tile[10].image, 720, 192, gp.tileSize, gp.tileSize, null);
        int x15_y5 = 10;
        g2.drawImage(tile[10].image, 768, 192, gp.tileSize, gp.tileSize, null);
        int x16_y5 = 10;
        g2.drawImage(tile[6].image, 816, 192, gp.tileSize, gp.tileSize, null);
        int x17_y5 = 6;
        g2.drawImage(tile[0].image, 864, 192, gp.tileSize, gp.tileSize, null);
        int x18_y5 = 0;



        //////////////////////////////sechste reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 240, gp.tileSize, gp.tileSize, null);
        int x0_y6 = 0;
        g2.drawImage(tile[4].image, 48, 240, gp.tileSize, gp.tileSize, null);
        int x1_y6 = 4;
        g2.drawImage(tile[11].image, 96, 240, gp.tileSize, gp.tileSize, null);
        int x2_y6 = 11;
        g2.drawImage(tile[10].image, 144, 240, gp.tileSize, gp.tileSize, null);
        int x3_y6 = 10;
        g2.drawImage(tile[10].image, 192, 240, gp.tileSize, gp.tileSize, null);
        int x4_y6 = 10;
        g2.drawImage(tile[10].image, 240, 240, gp.tileSize, gp.tileSize, null);
        int x5_y6 = 10;
        g2.drawImage(tile[10].image, 288, 240, gp.tileSize, gp.tileSize, null);
        int x6_y6 = 10;
        g2.drawImage(tile[10].image, 336, 240, gp.tileSize, gp.tileSize, null);
        int x7_y6 = 10;
        g2.drawImage(tile[10].image, 384, 240, gp.tileSize, gp.tileSize, null);
        int x8_y6 = 10;
        g2.drawImage(tile[19].image, 432, 240, gp.tileSize, gp.tileSize, null);
        int x9_y6 = 19;
        g2.drawImage(tile[10].image, 480, 240, gp.tileSize, gp.tileSize, null);
        int x10_y6 = 10;
        g2.drawImage(tile[11].image, 528, 240, gp.tileSize, gp.tileSize, null);
        int x11_y6 = 11;
        g2.drawImage(tile[10].image, 576, 240, gp.tileSize, gp.tileSize, null);
        int x12_y6 = 10;
        g2.drawImage(tile[10].image, 624, 240, gp.tileSize, gp.tileSize, null);
        int x13_y6 = 10;
        g2.drawImage(tile[6].image, 672, 240, gp.tileSize, gp.tileSize, null);
        int x14_y6 = 6;
        g2.drawImage(tile[5].image, 720, 240, gp.tileSize, gp.tileSize, null);
        int x15_y6 = 5;
        g2.drawImage(tile[5].image, 768, 240, gp.tileSize, gp.tileSize, null);
        int x16_y6 = 5;
        g2.drawImage(tile[0].image, 816, 240, gp.tileSize, gp.tileSize, null);
        int x17_y6 = 0;
        g2.drawImage(tile[0].image, 864, 240, gp.tileSize, gp.tileSize, null);
        int x18_y6 = 0;

        //////////////////////////////siebte reihe/////////////////////////////
        g2.drawImage(tile[9].image, 0, 288, gp.tileSize, gp.tileSize, null);
        int x0_y7 = 9;
        g2.drawImage(tile[10].image, 48, 288, gp.tileSize, gp.tileSize, null);
        int x1_y7 = 10;
        g2.drawImage(tile[15].image, 96, 288, gp.tileSize, gp.tileSize, null);
        int x2_y7 = 15;
        g2.drawImage(tile[10].image, 144, 288, gp.tileSize, gp.tileSize, null);
        int x3_y7 = 10;
        g2.drawImage(tile[11].image, 192, 288, gp.tileSize, gp.tileSize, null);
        int x4_y7 = 11;
        g2.drawImage(tile[10].image, 240, 288, gp.tileSize, gp.tileSize, null);
        int x5_y7 = 10;
        g2.drawImage(tile[10].image, 288, 288, gp.tileSize, gp.tileSize, null);
        int x6_y7 = 10;
        g2.drawImage(tile[10].image, 336, 288, gp.tileSize, gp.tileSize, null);
        int x7_y7 = 10;
        g2.drawImage(tile[10].image, 384, 288, gp.tileSize, gp.tileSize, null);
        int x8_y7 = 10;
        g2.drawImage(tile[19].image, 432, 288, gp.tileSize, gp.tileSize, null);
        int x9_y7 = 19;
        g2.drawImage(tile[10].image, 480, 288, gp.tileSize, gp.tileSize, null);
        int x10_y7 = 10;
        g2.drawImage(tile[11].image, 528, 288, gp.tileSize, gp.tileSize, null);
        int x11_y7 = 11;
        g2.drawImage(tile[6].image, 576, 288, gp.tileSize, gp.tileSize, null);
        int x12_y7 = 6;
        g2.drawImage(tile[5].image, 624, 288, gp.tileSize, gp.tileSize, null);
        int x13_y7 = 5;
        g2.drawImage(tile[0].image, 672, 288, gp.tileSize, gp.tileSize, null);
        int x14_y7 = 0;
        g2.drawImage(tile[0].image, 720, 288, gp.tileSize, gp.tileSize, null);
        int x15_y7 = 0;
        g2.drawImage(tile[0].image, 768, 288, gp.tileSize, gp.tileSize, null);
        int x16_y7 = 0;
        g2.drawImage(tile[0].image, 816, 288, gp.tileSize, gp.tileSize, null);
        int x17_y7 = 0;
        g2.drawImage(tile[0].image, 864, 288, gp.tileSize, gp.tileSize, null);
        int x18_y7 = 0;

        //////////////////////////////achte reihe/////////////////////////////
        g2.drawImage(tile[9].image, 0, 336, gp.tileSize, gp.tileSize, null);
        int x0_y8 = 9;
        g2.drawImage(tile[10].image, 48, 336, gp.tileSize, gp.tileSize, null);
        int x1_y8 = 10;
        g2.drawImage(tile[13].image, 96, 336, gp.tileSize, gp.tileSize, null);
        int x2_y8 = 13;
        g2.drawImage(tile[16].image, 144, 336, gp.tileSize, gp.tileSize, null);
        int x3_y8 = 16;
        g2.drawImage(tile[16].image, 192, 336, gp.tileSize, gp.tileSize, null);
        int x4_y8 = 16;
        g2.drawImage(tile[16].image, 240, 336, gp.tileSize, gp.tileSize, null);
        int x5_y8 = 16;
        g2.drawImage(tile[16].image, 288, 336, gp.tileSize, gp.tileSize, null);
        int x6_y8 = 16;
        g2.drawImage(tile[16].image, 336, 336, gp.tileSize, gp.tileSize, null);
        int x7_y8 = 16;
        g2.drawImage(tile[16].image, 384, 336, gp.tileSize, gp.tileSize, null);
        int x8_y8 = 16;
        g2.drawImage(tile[17].image, 432, 336, gp.tileSize, gp.tileSize, null);
        int x9_y8 = 17;
        g2.drawImage(tile[11].image, 480, 336, gp.tileSize, gp.tileSize, null);
        int x10_y8 = 11;
        g2.drawImage(tile[6].image, 528, 336, gp.tileSize, gp.tileSize, null);
        int x11_y8 = 6;
        g2.drawImage(tile[0].image, 576, 336, gp.tileSize, gp.tileSize, null);
        int x12_y8 = 0;
        g2.drawImage(tile[0].image, 624, 336, gp.tileSize, gp.tileSize, null);
        int x13_y8 = 0;
        g2.drawImage(tile[0].image, 672, 336, gp.tileSize, gp.tileSize, null);
        int x14_y8 = 0;
        g2.drawImage(tile[0].image, 720, 336, gp.tileSize, gp.tileSize, null);
        int x15_y8 = 0;
        g2.drawImage(tile[0].image, 768, 336, gp.tileSize, gp.tileSize, null);
        int x16_y8 = 0;
        g2.drawImage(tile[0].image, 816, 336, gp.tileSize, gp.tileSize, null);
        int x17_y8 = 0;
        g2.drawImage(tile[0].image, 864, 336, gp.tileSize, gp.tileSize, null);
        int x18_y8 = 0;

        //////////////////////////////neunte reihe/////////////////////////////
        g2.drawImage(tile[9].image, 0, 384, gp.tileSize, gp.tileSize, null);
        int x0_y9 = 9;
        g2.drawImage(tile[11].image, 48, 384, gp.tileSize, gp.tileSize, null);
        int x1_y9 = 11;
        g2.drawImage(tile[10].image, 96, 384, gp.tileSize, gp.tileSize, null);
        int x2_y9 = 10;
        g2.drawImage(tile[10].image, 144, 384, gp.tileSize, gp.tileSize, null);
        int x3_y9 = 10;
        g2.drawImage(tile[10].image, 192, 384, gp.tileSize, gp.tileSize, null);
        int x4_y9 = 10;
        g2.drawImage(tile[10].image, 240, 384, gp.tileSize, gp.tileSize, null);
        int x5_y9 = 10;
        g2.drawImage(tile[10].image, 288, 384, gp.tileSize, gp.tileSize, null);
        int x6_y9 = 10;
        g2.drawImage(tile[6].image, 336, 384, gp.tileSize, gp.tileSize, null);
        int x7_y9 = 6;
        g2.drawImage(tile[5].image, 384, 384, gp.tileSize, gp.tileSize, null);
        int x8_y9 = 5;
        g2.drawImage(tile[5].image, 432, 384, gp.tileSize, gp.tileSize, null);
        int x9_y9 = 5;
        g2.drawImage(tile[5].image, 480, 384, gp.tileSize, gp.tileSize, null);
        int x10_y9 = 5;
        g2.drawImage(tile[0].image, 528, 384, gp.tileSize, gp.tileSize, null);
        int x11_y9 = 0;
        g2.drawImage(tile[0].image, 576, 384, gp.tileSize, gp.tileSize, null);
        int x12_y9 = 0;
        g2.drawImage(tile[0].image, 624, 384, gp.tileSize, gp.tileSize, null);
        int x13_y9 = 0;
        g2.drawImage(tile[12].image, 672, 384, gp.tileSize, gp.tileSize, null);
        int x14_y9 = 12;
        g2.drawImage(tile[0].image, 720, 384, gp.tileSize, gp.tileSize, null);
        int x15_y9 = 0;
        g2.drawImage(tile[0].image, 768, 384, gp.tileSize, gp.tileSize, null);
        int x16_y9 = 0;
        g2.drawImage(tile[0].image, 816, 384, gp.tileSize, gp.tileSize, null);
        int x17_y9 = 0;
        g2.drawImage(tile[0].image, 864, 384, gp.tileSize, gp.tileSize, null);
        int x18_y9 = 0;

        //////////////////////////////zehnte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 432, gp.tileSize, gp.tileSize, null);
        int x0_y10 = 0;
        g2.drawImage(tile[5].image, 48, 432, gp.tileSize, gp.tileSize, null);
        int x1_y10 = 5;
        g2.drawImage(tile[5].image, 96, 432, gp.tileSize, gp.tileSize, null);
        int x2_y10 = 5;
        g2.drawImage(tile[5].image, 144, 432, gp.tileSize, gp.tileSize, null);
        int x3_y10 = 5;
        g2.drawImage(tile[5].image, 192, 432, gp.tileSize, gp.tileSize, null);
        int x4_y10 = 5;
        g2.drawImage(tile[5].image, 240, 432, gp.tileSize, gp.tileSize, null);
        int x5_y10 = 5;
        g2.drawImage(tile[5].image, 288, 432, gp.tileSize, gp.tileSize, null);
        int x6_y10 = 5;
        g2.drawImage(tile[0].image, 336, 432, gp.tileSize, gp.tileSize, null);
        int x7_y10 = 0;
        g2.drawImage(tile[0].image, 384, 432, gp.tileSize, gp.tileSize, null);
        int x8_y10 = 0;
        g2.drawImage(tile[0].image, 432, 432, gp.tileSize, gp.tileSize, null);
        int x9_y10 = 0;
        g2.drawImage(tile[0].image, 480, 432, gp.tileSize, gp.tileSize, null);
        int x10_y10 = 0;
        g2.drawImage(tile[0].image, 528, 432, gp.tileSize, gp.tileSize, null);
        int x11_y10 = 0;
        g2.drawImage(tile[0].image, 576, 432, gp.tileSize, gp.tileSize, null);
        int x12_y10 = 0;
        g2.drawImage(tile[0].image, 624, 432, gp.tileSize, gp.tileSize, null);
        int x13_y10 = 0;
        g2.drawImage(tile[0].image, 672, 432, gp.tileSize, gp.tileSize, null);
        int x14_y10 = 0;
        g2.drawImage(tile[0].image, 720, 432, gp.tileSize, gp.tileSize, null);
        int x15_y10 = 0;
        g2.drawImage(tile[0].image, 768, 432, gp.tileSize, gp.tileSize, null);
        int x16_y10 = 0;
        g2.drawImage(tile[0].image, 816, 432, gp.tileSize, gp.tileSize, null);
        int x17_y10 = 0;
        g2.drawImage(tile[0].image, 864, 432, gp.tileSize, gp.tileSize, null);
        int x18_y10 = 0;
        
            
        Random rand = new Random();
        // Generiere 4 gerade Zahlen
        int even1 = 20 + 2 * rand.nextInt(8); // 20, 22, 24, 26, 28, 30, 32, 34
        int even2 = 20 + 2 * rand.nextInt(8);
        int even3 = 20 + 2 * rand.nextInt(8);
        int even4 = 20 + 2 * rand.nextInt(8);
        // Generiere 4 ungerade Zahlen
        int odd1 = 21 + 2 * rand.nextInt(8); // 21, 23, 25, 27, 29, 31, 33, 35
        int odd2 = 21 + 2 * rand.nextInt(8);
        int odd3 = 21 + 2 * rand.nextInt(8);
        int odd4 = 21 + 2 * rand.nextInt(8);
    
        g2.drawImage(tile[even1].image, SetPosition.team1Unit1AusPosX, SetPosition.team1Unit1AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[even2].image, SetPosition.team1Unit2AusPosX, SetPosition.team1Unit2AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[even3].image, SetPosition.team1Unit3AusPosX, SetPosition.team1Unit3AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[even4].image, SetPosition.team1Unit4AusPosX, SetPosition.team1Unit4AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[odd1].image, SetPosition.team2Unit1AusPosX, SetPosition.team2Unit1AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[odd2].image, SetPosition.team2Unit2AusPosX, SetPosition.team2Unit2AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[odd3].image, SetPosition.team2Unit3AusPosX, SetPosition.team2Unit3AusPosY, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[odd4].image, SetPosition.team2Unit4AusPosX, SetPosition.team2Unit4AusPosY, gp.tileSize, gp.tileSize, null);
        
        
    }
}


