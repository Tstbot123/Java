package Units;

import Models.Model;
import Feld.Type;
import Feld.Spielfeld;

public abstract class Unit {
    protected int cost;
    protected int move;
    protected String weapon1;
    protected int weapon1Range;
    protected String weapon2;
    protected int weapon2Range;
    protected String[] canFire;
    protected int baseVision;
    protected Model model;
    protected int x, y;
    protected int vision;

    public Unit(int cost, int move, String weapon1, int weapon1Range, String weapon2, int weapon2Range, String[] canFire, int baseVision, Model model, int x, int y) {
        this.cost = cost;
        this.move = move;
        this.weapon1 = weapon1;
        this.weapon1Range = weapon1Range;
        this.weapon2 = weapon2;
        this.weapon2Range = weapon2Range;
        this.canFire = canFire;
        this.baseVision = baseVision;
        this.model = model;
        this.x = x;
        this.y = y;
    }

    public int getMove() {
        return move;
    }

    public int[] getPosition() {
        return new int[]{x, y};
    }

    public abstract void setPosition(int x, int y, Spielfeld spielfeld);

    public abstract Feld.Type getFeldTyp(Spielfeld spielfeld);

    public int getMovementCost(Type type) {
        switch (type) {
            case PLAIN:
                return 1;
            case WOOD:
                return 2;
            case MOUNTAIN:
                return 3;
            case SEA:
                return Integer.MAX_VALUE; // Einheiten, die nicht auf dem Meer fahren können, haben unendliche Kosten
            default:
                return Integer.MAX_VALUE;
        }
    }
}

