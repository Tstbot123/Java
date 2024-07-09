package units;

public class Unit {
    private String name;
    private int move;
    private int movePlain;
    private int moveWood;
    private int moveMountain;
    private int moveWater;

    private Weapon weapon1;
    private Weapon weapon2;
    private String canFire;

    public Unit(String name, int move, int movePlain, int moveWood, int moveMountain, int moveWater, Weapon weapon1, Weapon weapon2, String canFire) {
        this.name = name;
        this.move = move;
        this.movePlain = movePlain;
        this.moveWood = moveWood;
        this.moveMountain = moveMountain;
        this.moveWater = moveWater;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
        this.canFire = canFire;
    }
     /**
        public void move() {
            System.out.println(name + " moves " + move + " spaces.");
        }

        public void attack() {
            System.out.println(name + " attacks with " + weapon1.getName() + ".");
        }

        public void secondaryAttack() {
            if (weapon2 != null) {
                System.out.println(name + " can also attack with " + weapon2.getName() + ".");
            } else {
                System.out.println(name + " has no secondary weapon.");
            }
        }

        public void canFire() {
            System.out.println(name + " can fire on: " + canFire);
        }
     **/
}
