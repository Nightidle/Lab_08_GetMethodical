import java.util.Scanner;

public class DevTest
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        /*//testing 1st method
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println(name); */

        //testing 2nd method
        /* int num = SafeInput.getInt(in, "Enter a number");
        System.out.println(num); */

        //testing 3rd method
        /*double num = SafeInput.getDouble(in, "Enter a double");
        System.out.println(num);*/

        //testing 4th method
        /*int number = SafeInput.getRangedInt(in, "Enter a number between", 1, 10);
        System.out.println(number);*/

        //testing 5th method
        /* double number = SafeInput.getRangedDouble(in, "Enter a number between", 2.3, 7.4);
        System.out.println(number); */

        //testing 6th method
        /* boolean response = SafeInput.getYNConfirm(in, "Would you like to continue?");
        System.out.println(response); */

        //testing 7th method
        /* String phoneNumber = SafeInput.getRegExString(in, "Please enter your phone number (###-###-####)", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.print("Your number is: " + phoneNumber); */
    }

    // The start of the methods
    /*public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }*/

    /* public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear newline
                done = true;
            } else {
                System.out.println("Invalid integer. Try again.");
                pipe.nextLine(); // clear trash
            }
        } while (!done);

        return retVal;
    } */

    /*public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                    done = true;
                else
                    System.out.println("Input out of range.");
            }
            else
            {
                System.out.println("Invalid integer.");
                pipe.nextLine();
            }
        }while(!done);

        return retVal;
    } */

    /* public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                    done = true;
                else
                    System.out.println("Input out of range.");
            }
            else
            {
                System.out.println("Invalid double.");
                pipe.nextLine();
            }
        }while(!done);

        return retVal;
    } */

    /* public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim();

            if (response.equalsIgnoreCase("Y"))
                return true;
            else if (response.equalsIgnoreCase("N"))
                return false;
            else
                System.out.println("Invalid input. Enter Y or N.");
        } while (!done);

        return false; // unreachable but required
    } */

    /* public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String input = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();

            if (input.matches(regEx))
                done = true;
            else
                System.out.println("Input does not match.");
        } while (!done);

        return input;
    } */

}
