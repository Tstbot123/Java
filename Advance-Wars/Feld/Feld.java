package Feld;

public class Feld {
    private Type type;

    public Feld(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        PLAIN, WOOD, MOUNTAIN, SEA
    }
}

