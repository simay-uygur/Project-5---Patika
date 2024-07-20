abstract class Animal {
    String name;
    int age;
    double weight;
    
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    abstract double getDosage();
    abstract int getFeedSchedule();
    
}
