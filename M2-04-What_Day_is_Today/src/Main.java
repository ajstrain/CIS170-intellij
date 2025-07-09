import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create scanner obj
        Scanner input = new Scanner(System.in);

        //prompt user to enter a day of the week
        System.out.print("Enter any day of the Week: ");
        String day = input.nextLine().toLowerCase();

        //switch statement
        switch (day) {
            case "monday":
                case "tuesday":
                    case "thursday":
                        System.out.print("It's a weekday!: ");
                        break;

            case "wednesday":
                System.out.println("Hump Daaaaay");
                break;

            case "friday":
                System.out.print("TGIF!: ");
                break;

            case "saturday":
                case "sunday":
                    System.out.print("It's the weekend!: ");
                    break;

            default:
                System.out.println("Invalid day");
                break;
        }

        }
    }
