package Units;

import Models.Model;
import Field.Type;
import Field.GameField;

public class LandUnits {

    public static class Infantry extends Unit {
        public Infantry(Model model, int x, int y, GameField gameField) {
            super(1000, 3, "/", 0, "Machine Gun", 1, new String[]{"Infantry", "Vehicle", "Copter"}, 2, model, x, y);
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

    public static class Mech extends Unit {
        public Mech(Model model, int x, int y, GameField gameField) {
            super(3000, 2, "Bazookas – 3/3", 1, "Machine Gun", 1, new String[]{"Vehicle", "Infantry", "Copter"}, 2, model, x, y);
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

    public static class Tank extends Unit {
        public Tank(Model model, int x, int y, GameField gameField) {
            super(7000, 6, "Cannon – 9/9", 1, "Machine Gun", 1, new String[]{"Vehicle", "Infantry", "Copter"}, 3, model, x, y);
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

    public static class Artillery extends Unit {
        public Artillery(Model model, int x, int y, GameField gameField) {
            super(6000, 5, "Cannon – 9/9", 2, "/", 0, new String[]{"Vehicle", "Infantry"}, 1, model, x, y);
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

    public static class AntiAir extends Unit {
        public AntiAir(Model model, int x, int y, GameField gameField) {
            super(8000, 6, "Vulcan – 9/9", 1, "/", 0, new String[]{"Vehicle", "Infantry", "Copter", "Plane"}, 2, model, x, y);
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

