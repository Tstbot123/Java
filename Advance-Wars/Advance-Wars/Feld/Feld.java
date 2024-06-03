package Field;

public class Tile {
    private Type type;

    public Tile(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        PLAIN, WOOD, MOUNTAIN, SEA
    }
}

