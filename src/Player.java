public class Player {
    private double health = 100.0;
    private double attackPoints = 10.0;
    private double defencePoints = 10.0;

    private double speedPoints = 10.0;


    private String name;

    public Player(String name){
        this.name = name;
        this.attackPoints *= Math.random();
        this.defencePoints *= Math.random();
        this.speedPoints *= Math.random();
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    public double getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(double defencePoints) {
        this.defencePoints = defencePoints;
    }

    public double getSpeedPoints() {
        return speedPoints;
    }

    public void setSpeedPoints(double speedPoints) {
        this.speedPoints = speedPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
