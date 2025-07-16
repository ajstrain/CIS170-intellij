import java.util.ArrayList;
public class Person {
    //declare variables for person's attributes
    private String name;
    private String dob;
    private String ssn;
    private int age;
    private ArrayList<String> pets;


    //set up constructors
    public Person(String name, int age, String dob, String ssn,  ArrayList<String> pets) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.ssn = ssn;
        this.pets = pets;
    }

    //set up getters and setters
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDob() {
        return dob;
    }
    public String getSsn() {
        return ssn;
    }
    public ArrayList<String> getPets() {
        return pets;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }

    //greet method for each of my person objects
    public void greet(){
        if (pets.isEmpty()) {
            //for no pets
            System.out.println("Hello! My name is " + name + ", I am " + age + "years old, and I have no pets.");
        }else{
            //has pets
            System.out.println("Hello! My name is " + name + ", I am " + age + " years old, and my pets are " + getPetList() + ".");
        }

    }
    //had to create a method to get a count of pets and return as a string
    private String getPetList() {
        String petList = "";
        int count = 0;
        for (String pet : pets) {
            petList += pet;
            count++;
            if (count < pets.size()) {
                petList += ",";
            }
        }
        return petList;
    }
}
