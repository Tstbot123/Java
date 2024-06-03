package Units;

import Models.Model;
import Feld.Type;
import Feld.Spielfeld;

public class Flugeinheiten {

    public abstract class Flugeinheit extends Unit {

        public Flugeinheit(int cost, int move, String weapon1, int weapon1Range, String weapon2, int weapon2Range, String[] canFire, int baseVision, Model model, int x, int y) {
            super(cost, move, weapon1, weapon1Range, weapon2, weapon2Range, canFire, baseVision, model, x, y);
        }
    }

    public class Fighter extends Flugeinheit {
        public Fighter(Model model, int x, int y, Spielfeld spielfeld) {
            super(20000, 9, "Missiles – 9/9", 1, "/", 0, new String[]{"CPtr", "Plane"}, 2, model, x, y);
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

    public class Bomber extends Flugeinheit {
        public Bomber(Model model, int x, int y, Spielfeld spielfeld) {
            super(22000, 7, "Bombs – 9/9", 1, "/", 0, new String[]{"Veh", "Inftry"}, 2, model, x, y);
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

    public class BCptr extends Flugeinheit {
        public BCptr(Model model, int x, int y, Spielfeld spielfeld) {
            super(9000, 6, "Missiles – 6/6", 1, "M Gun", 1, new String[]{"Veh", "Inftry", "CPtr"}, 3, model, x, y);
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

