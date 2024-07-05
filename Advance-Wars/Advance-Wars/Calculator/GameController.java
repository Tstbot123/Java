import javafx.scene.layout.Pane;

public class GameController {

    private Pane root;
    private GameBoard gameBoard;
    private PlayerController playerController;

    public GameController(Pane root) {
        this.root = root;
        initializeGame();
    }

    private void initializeGame() {
        gameBoard = new GameBoard();
        root.getChildren().add(gameBoard.getBoardPane());
        playerController = new PlayerController(gameBoard);

        // Initialize players and units on specific positions
        initializeUnits();
    }

    private void initializeUnits() {
        // Add units for both players on the board
        gameBoard.addUnit(new Infantry(1, 1, "Player1"));
        gameBoard.addUnit(new Tank(2, 2, "Player1"));
        gameBoard.addUnit(new Fighter(3, 3, "Player1"));
        gameBoard.addUnit(new Infantry(5, 5, "Player2"));
        gameBoard.addUnit(new Tank(6, 6, "Player2"));
        gameBoard.addUnit(new Bomber(7, 7, "Player2"));
    }
}
