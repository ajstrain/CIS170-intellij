import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Prompt user
        System.out.print("How many times do you want to flip a coin?");
        int numFlips = scanner.nextInt();

        //flip coin x amt of times
        for (int i = 1; i <= numFlips; i++) {
            //
            boolean isHeads = random.nextBoolean();
            String result = isHeads ? "heads" : "tails";
            System.out.println("Flip " + i + ": " + result);
        }
    }
}
