package Calculator;

import Feld.Spielfeld;
import Units.Unit;

public class VisionCalculator {

    public static int calculateVision(Unit unit, Spielfeld spielfeld) {
        int baseVision = unit.baseVision;
        Feld.Type currentType = unit.getFeldTyp(spielfeld);

        switch (currentType) {
            case MOUNTAIN:
                return baseVision + 3;
            default:
                return baseVision;
        }
    }
}

