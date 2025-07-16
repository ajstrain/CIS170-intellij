import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //created list for my person object
        ArrayList<Person> people = new ArrayList<>();

        //add 5 objects
        people.add(new Person("John", 25, "01/01/0101", "111-11-1111", new ArrayList<>(List.of("Dog","Cat"))));
        people.add(new Person("Jane", 30, "02/02/0202", "222-22-2222", new ArrayList<>(List.of("Parrot"))));
        people.add(new Person("Bob", 35, "03/03/0303", "333-33-3333", new ArrayList<>()));//<----no pet
        people.add(new Person("Alice", 28, "04/04/0404", "444-44-4444", new ArrayList<>(List.of("Turtle","Cow"))));
        people.add(new Person("Charli", 22, "05/05/0505", "555-55-5555", new ArrayList<>(List.of("Lion","Bear"))));

        //set up loop for each obj
        for (Person person : people){
            person.greet();
        }
    }

}
