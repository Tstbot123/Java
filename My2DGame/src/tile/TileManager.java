package tile;

import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;


public class TileManager {

    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[16];
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

            //tile[] = new Tile();
            //tile[].image = ImageIO.read(getClass().getResourceAsStream("/res/tiles/.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {
        //////////////////////////erste reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 48, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 96, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 144, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 240, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 288, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 336, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 432, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 480, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 528, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 624, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 672, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 720, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 768, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 816, 0, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 864, 0, gp.tileSize, gp.tileSize, null);

        //////////////////////////zweite reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 48, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 96, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 144, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 240, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 288, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 336, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 384, 48, gp.tileSize, gp.tileSize, null);//
        g2.drawImage(tile[2].image, 432, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 480, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 528, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 576, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 48, gp.tileSize, gp.tileSize, null);


        ///////////////////////////////dritte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 48, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 96, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 144, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 240, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 288, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 336, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 384, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 96, gp.tileSize, gp.tileSize, null);

        //////////////////////////////vierte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 48, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 96, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 144, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);

        //////////////////////////////fünfte reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 48, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 144, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);



        //////////////////////////////sechste reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 48, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 144, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);

        /////////////////////////////siebte reihe/////////////////////////////
        g2.drawImage(tile[9].image, 0, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 48, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 144, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);

        //////////////////////////////achte reihe/////////////////////////////
        g2.drawImage(tile[9].image, 0, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 48, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 144, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);

        //////////////////////////////neunte reihe/////////////////////////////
        g2.drawImage(tile[9].image, 0, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 48, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 96, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 144, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[8].image, 864, 144, gp.tileSize, gp.tileSize, null);
        
        //////////////////////////////zente reihe/////////////////////////////
        g2.drawImage(tile[0].image, 0, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[5].image, 48, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[5].image, 96, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[5].image, 144, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[5].image, 192, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[2].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[4].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 672, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 720, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 768, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 816, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 864, 144, gp.tileSize, gp.tileSize, null);
    }
    // Weitere Tiles wie benötigt zeichnen
    }
