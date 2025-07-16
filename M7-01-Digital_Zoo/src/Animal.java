//create abstract animal class
public abstract class Animal {
    //create protected atrributes for subclasses
    protected String name;
    protected int age;

    //use final to set value
    protected final String species;

    //constructor for animal object
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }


    //method for every animal
    public abstract void makeSound();
    public abstract void eat();

    //final method "locked" *need to watch video or read more on this?*
    public final void displayInfo(){
        System.out.printf("%s Info: Name: %s, Age: %d, Species: %s%n",
                getClass().getSimpleName(), name, age, species);
    }
}
