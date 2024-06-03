package Feld;

public class Spielfeld {
    private Feld[][] felder;
    private int width;
    private int height;

    public Spielfeld(int width, int height) {
        this.width = width;
        this.height = height;
        felder = new Feld[width][height];
        initializeFeld();
    }

    private void initializeFeld() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                felder[x][y] = new Feld(Feld.Type.PLAIN); // Default type for example
            }
        }
    }

    public Feld getFeld(int x, int y) {
        return felder[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

