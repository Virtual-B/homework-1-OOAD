package polymorphia;

// import java.util.Random;

public class Adventurer {
    private String name;
    private double health;

    public Adventurer(String name, double initialHealth) {
        this.name = name;
        this.health = initialHealth;
    }
    // In case you want to add a random aspect to the fight, here is how you can generate random numbers
    //    static Random rand = new Random();
    //    int value = rand.nextInt(6) + 1;  // This generates a value between 1 and 6, inclusive

    // Below is a javadoc comment. It is here only to give you some direction on how to implement a fight method.
    // javadoc comments are not required in this course.
    /**
     * Engages the adventurer in a fight with the specified creature.
     *
     * @param foe the creature to fight against
     * @return true if the adventurer wins the fight, false otherwise
     */
    public boolean fight(Creature foe) {
        // TODO: Implement the fight logic here
        // This is just a placeholder implementation. You should replace it with your own logic.
        return false;
    }
}
