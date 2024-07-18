package org.apps.advancewars.units;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.apps.advancewars.terrain.Terrain;
import java.util.HashMap;
import java.util.Map;

public abstract class unit {
  
    protected int attackPower;
    protected int minAttackRange;
    protected int maxAttackRange;
    protected ImageView imageView;
    protected int row;
    protected int col;
    protected String name;
    protected int health;
    protected boolean attackAir = false;
    protected boolean attackMiddle = false;
    protected boolean attackGround = false;
    protected int movementRange;
    protected boolean movementBlocked = false;
    protected boolean attackBlocked = false;
    protected String team;
    protected Map<String, Integer> movementCosts; // Movement costs on different terrain



    public unit(String name, int health, int attackPower, int movementRange, String imagePath, String team) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.movementRange = movementRange;
        this.imageView = new ImageView(new Image(getClass().getResource(imagePath).toExternalForm()));
        this.movementCosts = new HashMap<>();
        this.team = team;
        try {
            this.imageView = new ImageView(new Image(getClass().getResource(imagePath).toExternalForm()));
        } catch (Exception e) {
            System.err.println("Error loading image: " + imagePath);
            e.printStackTrace();
            this.imageView = new ImageView(); //  set default ÍmageView if needed
        }
    }

    public String getName() {
        return name;
    }

    public int getMinAttackRange() {
        return minAttackRange;
    }

    public int getMaxAttackRange() {
        return maxAttackRange;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getMovementRange() {
        return movementRange;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getTeam() {
        return team;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setMovementBlocked(boolean blocked) {
        this.movementBlocked = blocked;
    }

    public boolean getMovementBlocked() {
        return movementBlocked;
    }

    public void setAttackBlocked(boolean attackBlocked) {
        this.attackBlocked = attackBlocked;
    }

    public boolean getAttackBlocked() {
        return attackBlocked;
    }

    public void move(int newRow, int newCol) {
        setPosition(newRow, newCol);
        
    }

    public boolean canMoveTo(int newRow, int newCol, Terrain terrain) {
        int distance = Math.abs(newRow - row) + Math.abs(newCol - col);
        int movementCosts = getMovementCost(terrain);
        int newDistance = distance + movementCosts - 1;
        return newDistance <= movementRange;

    }

    abstract public boolean isGroundUnit();



    abstract public boolean isAirUnit();

    abstract public boolean canAttackGroundUnit();



    abstract public boolean canAttackAirUnit();

    abstract public int getWaterMovementCosts();
    abstract public int getPlainMovementCosts();
    abstract public int getWoodMovementCosts();
    abstract public int getMountainMovementCosts();

    abstract public double getAntiAirModifier();
    abstract public double getBattleCopterModifier();
    abstract public double getBomberModifier();
    abstract public double getFighterModifier();
    abstract public double getInfantryModifier();
    abstract public double getMechanizedInfantryModifier();
    abstract public double getMobileArtilleryModifier();
    abstract public double getTankModifier();



    public boolean canAttack(unit enemy,int newRow, int newCol) {
        int distance = Math.abs(newRow - row) + Math.abs(newCol - col);
        return distance >= getMinAttackRange() && distance <= getMaxAttackRange()&&!getAttackBlocked();
    }

    // calculate movement cost based on Terrain type
    public int getMovementCost(Terrain terrain) {
        switch (terrain.getName()) {
            case "water":
                return getWaterMovementCosts();
            case "mountain":
                return getMountainMovementCosts();
            case "wood":
                return getWoodMovementCosts();
            default:
                return getPlainMovementCosts();
        }
    }
    
    public boolean movementCostsToHighForRange(int actualMovementCosts){
        boolean toHigh = false;
        if(actualMovementCosts > movementRange){
            toHigh = true;
        }
                return toHigh;
    }

    public void reset() {
        this.movementBlocked = false;
        this.attackBlocked = false;
    }
}
