import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //create arrray list
        ArrayList<Animal> zoo = new ArrayList<>();

        //add 2 lions and elephants to zoo
        zoo.add(new Lion("Simba", 5));
        zoo.add(new Lion("Lily", 6));
        zoo.add(new Elephant("Dumbo", 10));
        zoo.add(new Elephant("jimbo", 11));


        //sprinkle a little polymorphism in
        makeAllAnimalsSound(zoo);

        //did this to add a blank line for seperation
        System.out.println();

        //show the final keyword(display info)
        for (Animal animal : zoo) {
            animal.displayInfo();

        }
    }

    //method to loop and call makesound() for every animal
    private static void makeAllAnimalsSound(ArrayList<Animal> zoo) {
        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }

}




