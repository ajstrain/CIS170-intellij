import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare var
        int number=5;
        int guess;
        String secPass="JavaRocks";
        String inPass;

        //prompt user
        System.out.println("Guess a number between 1 and 20:");
        guess = scanner.nextInt();

        //set up while loop
        while(guess != number){
            if(guess < number){
                System.out.println("Too low try again:");
            }
            else {
                System.out.println("Too high try again:");
            }
            guess = scanner.nextInt();
        }

        //output for correct answer
        System.out.println("Correct! The Number is " + number + "!");

        //move to next line
        //(find way to clear console in java. console.clear()?
        scanner.nextLine();

        //prompt usr
        System.out.println("Enter the secret password:");

        //set up do while loop
        do{
            inPass = scanner.nextLine();
            if(!inPass.equals(secPass)){
                System.out.println("Incorrect. Try again: ");
            }
        }
        while (!inPass.equals(secPass));
        System.out.println("Access Granted");


    }

}
