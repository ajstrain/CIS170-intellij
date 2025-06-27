
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //prompt user
        System.out.print("What is your name?");

        //read input
        String userName = input.nextLine();

        //output msg
        System.out.print("It is nice to meet you,"+userName+"!");
        }
    }