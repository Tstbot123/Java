package Calculator;

import Field.GameField;
import Field.Tile.Type;
import Units.Unit;

public class VisionCalculator {

    public static int calculateVision(Unit unit, GameField gameField) {
        int baseVision = unit.baseVision;
        Type currentType = unit.getFieldType(gameField);

        switch (currentType) {
            case MOUNTAIN:
                return baseVision + 3;
            default:
                return baseVision;
        }
    }
}

