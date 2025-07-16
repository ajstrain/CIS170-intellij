public class Elephant extends Animal{

    //call the constructor
    public Elephant(String name, int age) {
        super(name, age, "Loxodonta");
    }

    //implement methods
    @Override
    public void makeSound() {
        System.out.println("Elephant named " + name + "makes a trumpet sound!");
    }
    @Override
    public void eat() {
        System.out.println(name + "eats plants.");
    }
}
