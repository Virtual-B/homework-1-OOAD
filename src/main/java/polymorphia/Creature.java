package polymorphia;

public class Creature {
    private String name;
    private double health;

    public Creature(String name, double initialHealth) {
        this.name = name;
        this.health = initialHealth;
    }

    public String getName(){
        return name;
    }
    public double getHealth(){
        return health;
    }
}