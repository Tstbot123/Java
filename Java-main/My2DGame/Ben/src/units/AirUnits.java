package units;

public class AirUnits {

    public static class Fighter extends Unit {
        public Fighter() {
            super("Fighter", 9, 1, 1, 1, 1,
                    new Weapon("Missiles"),
                    null,
                    "CPtr | Plane");
        }
    }

    public static class Bomber extends Unit {
        public Bomber() {
            super("Bomber", 7, 1, 2, 1, 0,
                    new Weapon("Bombs"),
                    null,
                    "Veh | Inftry");
        }
    }

    public static class BCPtr extends Unit {
        public BCPtr() {
            super("B-CPtr", 6, 1, 1, 1, 0,
                    new Weapon("Missiles"),
                    new Weapon("M Gun"),
                    "Inftry | Veh | CPtr");
        }
    }
}
