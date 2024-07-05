import javafx.scene.input.MouseEvent;

public class PlayerController {

    private GameBoard gameBoard;
    private Unit selectedUnit;

    public PlayerController(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        initializeMouseHandler();
    }

    private void initializeMouseHandler() {
        gameBoard.getBoardPane().setOnMouseClicked(this::handleMouseClick);
    }

    private void handleMouseClick(MouseEvent event) {
        int x = (int) (event.getX() / 50);
        int y = (int) (event.getY() / 50);
        if (selectedUnit == null) {
            selectedUnit = gameBoard.getUnitAt(x, y);
        } else {
            Unit targetUnit = gameBoard.getUnitAt(x, y);
            if (targetUnit != null && !selectedUnit.getPlayer().equals(targetUnit.getPlayer())) {
                gameBoard.attackUnit(selectedUnit, targetUnit);
            } else {
                gameBoard.moveUnit(selectedUnit, x, y);
            }
            selectedUnit = null;
        }
    }
}
