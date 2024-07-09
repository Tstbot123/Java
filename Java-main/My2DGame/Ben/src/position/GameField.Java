/*package position;

public class GameField {
    private final int maxScreenCol = 19;
    private final int maxScreenRow = 10;
    private Tile[][] field;
    private int[][] terrain = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 4, 10, 10, 10, 10, 10, 8},
        {0, 0, 0, 0, 0, 0, 0, 0, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {0, 0, 0, 0, 2, 2, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {0, 0, 2, 2, 4, 2, 2, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {0, 4, 2, 2, 4, 2, 2, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {9, 4, 2, 2, 4, 2, 2, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {9, 4, 2, 2, 4, 2, 2, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {9, 4, 2, 2, 4, 2, 2, 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8},
        {0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0}
    };

    public int getWidth() {
        return maxScreenCol;
    }

    public int getHeight() {
        return maxScreenRow;
    }

    public void updateUnitPosition(Unit unit) {
        // Implementieren Sie die Logik zur Aktualisierung der Einheitsposition im Spielfeld.
        // Dies könnte z.B. bedeuten, dass Sie eine Einheit in ein neues Feld setzen und das alte Feld leeren.
    }

    public void draw(Graphics2D g2) {
        for (int row = 0; row < maxScreenRow; row++) {
            for (int col = 0; col < maxScreenCol; col++) {
                int tileIndex = terrain[row][col];
                g2.drawImage(field[tileIndex].image, col * gp.tileSize, row * gp.tileSize, gp.tileSize, gp.tileSize, null);
            }
        }
    }
}
*/