import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//declare var
        Scanner scanner = new Scanner(System.in);
        int choice;
        int num1;
        int num2;


        do {
            //set up menu
            System.out.println("=== Calculator Menu ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit");
            System.out.println("For addition enter 1, for sub enter 2, etc");
            choice = scanner.nextInt();

            //set up exit
            if (choice == 6) {
                System.out.println("Exiting Calculator");
                break;
            }

            //get user input for numbers
            System.out.println("Enter first number");
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2 = scanner.nextInt();


            //perform selected option
            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;

                    //div by 0 error
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                        break;
                    } else {
                        System.out.println("ERROR DIV BY 0");
                        return;
                    }

                    //modulo by 0 error
                case 5:
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 % num2));
                    } else {
                        System.out.println("ERROR MODULO BY 0.");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

}










