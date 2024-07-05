package Units;

import Models.Model;
import Field.Type;
import Field.GameField;

public class AirUnits {

    public abstract class AirUnit extends Unit {

        public AirUnit(int cost, int move, String weapon1, int weapon1Range, String weapon2, int weapon2Range, String[] canFire, int baseVision, Model model, int x, int y) {
            super(cost, move, weapon1, weapon1Range, weapon2, weapon2Range, canFire, baseVision, model, x, y);
        }
    }

    public static class Fighter extends AirUnit {
        public Fighter(Model model, int x, int y, GameField gameField) {
            super(20000, 9, "Missiles – 9/9", 1, "/", 0, new String[]{"Copter", "Plane"}, 2, model, x, y);
            setPosition(x, y, gameField);
        }

        @Override
        public void setPosition(int x, int y, GameField gameField) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, gameField);
        }

        @Override
        public Field.Type getFieldType(GameField gameField) {
            return gameField.getField(x, y).getType();
        }
    }

    public static class Bomber extends AirUnit {
        public Bomber(Model model, int x, int y, GameField gameField) {
            super(22000, 7, "Bombs – 9/9", 1, "/", 0, new String[]{"Vehicle", "Infantry"}, 2, model, x, y);
            setPosition(x, y, gameField);
        }

        @Override
        public void setPosition(int x, int y, GameField gameField) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, gameField);
        }

        @Override
        public Field.Type getFieldType(GameField gameField) {
            return gameField.getField(x, y).getType();
        }
    }

    public class BattleCopter extends AirUnit {
        public BattleCopter(Model model, int x, int y, GameField gameField) {
            super(9000, 6, "Missiles – 6/6", 1, "Machine Gun", 1, new String[]{"Vehicle", "Infantry", "Copter"}, 3, model, x, y);
            setPosition(x, y, gameField);
        }

        @Override
        public void setPosition(int x, int y, GameField gameField) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, gameField);
        }

        @Override
        public Field.Type getFieldType(GameField gameField) {
            return gameField.getField(x, y).getType();
        }
    }
}

