package units;

public class LandUnits {

    public static class Infantry extends Unit {
        public Infantry() {
            super("Infantry", 3, 1, 1, 2, 0,
                    new Weapon("/"),
                    new Weapon("M Gun"),
                    "Inftry | Veh | CPtr");
        }
    }

    public static class Mech extends Unit {
        public Mech() {
            super("Mech", 2, 1, 1, 1, 0,
                    new Weapon("Bazookas"),
                    new Weapon("M Gun"),
                    "Inftry | Veh | CPtr");
        }
    }

    public static class Tank extends Unit {
        public Tank() {
            super("Tank", 6, 1, 2, 0, 0,
                    new Weapon("Cannon"),
                    new Weapon("M Gun"),
                    "Inftry | Veh | CPtr");
        }
    }

    public static class Artly extends Unit {
        public Artly() {
            super("Artly", 5, 1, 2, 0, 0,
                    new Weapon("Cannon"),
                    null,
                    "Veh | Inftry");
        }
    }

    public static class AAir extends Unit {
        public AAir() {
            super("A-Air", 6, 1, 2, 0, 0,
                    new Weapon("Vulcan"),
                    null,
                    "Veh | Inftry | CPtr | Plane");
        }
    }
}