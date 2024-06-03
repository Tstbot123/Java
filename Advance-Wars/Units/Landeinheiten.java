package Units;

import Models.Model;
import Feld.Type;
import Feld.Spielfeld;

public class Landeinheiten {

    public static class Infantry extends Unit {
        public Infantry(Model model, int x, int y, Spielfeld spielfeld) {
            super(1000, 3, "/", 0, "M Gun", 1, new String[]{"Inftry", "Veh", "CPtr"}, 2, model, x, y);
            setPosition(x, y, spielfeld);
        }

        @Override
        public void setPosition(int x, int y, Spielfeld spielfeld) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, spielfeld);
        }

        @Override
        public Feld.Type getFeldTyp(Spielfeld spielfeld) {
            return spielfeld.getFeld(x, y).getType();
        }
    }

    public static class Mech extends Unit {
        public Mech(Model model, int x, int y, Spielfeld spielfeld) {
            super(3000, 2, "Bazookas – 3/3", 1, "M Gun", 1, new String[]{"Veh", "Inftry", "CPtr"}, 2, model, x, y);
            setPosition(x, y, spielfeld);
        }

        @Override
        public void setPosition(int x, int y, Spielfeld spielfeld) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, spielfeld);
        }

        @Override
        public Feld.Type getFeldTyp(Spielfeld spielfeld) {
            return spielfeld.getFeld(x, y).getType();
        }
    }

    public static class Tank extends Unit {
        public Tank(Model model, int x, int y, Spielfeld spielfeld) {
            super(7000, 6, "Cannon – 9/9", 1, "M Gun", 1, new String[]{"Veh", "Inftry", "CPtr"}, 3, model, x, y);
            setPosition(x, y, spielfeld);
        }

        @Override
        public void setPosition(int x, int y, Spielfeld spielfeld) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, spielfeld);
        }

        @Override
        public Feld.Type getFeldTyp(Spielfeld spielfeld) {
            return spielfeld.getFeld(x, y).getType();
        }
    }

    public static class Artly extends Unit {
        public Artly(Model model, int x, int y, Spielfeld spielfeld) {
            super(6000, 5, "Cannon – 9/9", 2, "/", 0, new String[]{"Veh", "Inftry"}, 1, model, x, y);
            setPosition(x, y, spielfeld);
        }

        @Override
        public void setPosition(int x, int y, Spielfeld spielfeld) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, spielfeld);
        }

        @Override
        public Feld.Type getFeldTyp(Spielfeld spielfeld) {
            return spielfeld.getFeld(x, y).getType();
        }
    }

    public static class A_Air extends Unit {
        public A_Air(Model model, int x, int y, Spielfeld spielfeld) {
            super(8000, 6, "Vulcan – 9/9", 1, "/", 0, new String[]{"Veh", "Inftry", "CPtr", "Plane"}, 2, model, x, y);
            setPosition(x, y, spielfeld);
        }

        @Override
        public void setPosition(int x, int y, Spielfeld spielfeld) {
            this.x = x;
            this.y = y;
            this.vision = VisionCalculator.calculateVision(this, spielfeld);
        }

        @Override
        public Feld.Type getFeldTyp(Spielfeld spielfeld) {
            return spielfeld.getFeld(x, y).getType();
        }
    }
}

