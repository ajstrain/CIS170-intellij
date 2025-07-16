public class Lion extends Animal {//make sure I implement methods

    public Lion(String name, int age) {
        //make sure I call constructor
        super(name, age, "Panthera leo");
    }

    //implement methods
    @Override
    public void makeSound() {
        System.out.println("Lion named " + name + " makes a roar!");
    }

    @Override
    public void eat() {
        System.out.println(name + "eats meat");
    }

}
