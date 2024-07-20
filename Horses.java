/**
 * Horses
 */
public class Horses extends Animal {
    public Horses(String name, int age, double weight) {
        super(name, age, weight);
    }
    
    public double getDosage() {
        return 1.2;
    }
    
    public int getFeedSchedule() {
        return 3;
    }

    
}