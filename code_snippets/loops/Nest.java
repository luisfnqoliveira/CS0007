import java.util.*;
import java.io.*;


public class Nest {

    public static void nestedPowers() {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Powers of two! The language of the computer.");
        System.out.println("Enter a non-negative number between 1 and 10 and the program will calculate its power of 2.");
        System.out.println("E.g., 10 => 2^10 = 1024.");
        System.out.println("Enter -1 to leave.");

        System.out.println("Which power of 2 do you want to calculate?");
        int number = kbd.nextInt();

        while ( (number != -1) && ((number < 1) || (number > 10)) )
        {
            System.out.println("Invalid input");
            System.out.println("Which power of 2 do you want to calculate?");
            number = kbd.nextInt();
        }

        while(number != -1)
        {
            System.out.println("2^" + number + " = " + Math.pow(2.0, number));
            System.out.println("Which power of 2 do you want to calculate?");
            number = kbd.nextInt();
            while ( (number != -1) && ((number < 1) || (number > 10)) )
            {
                System.out.println("Invalid input");
                System.out.println("Which power of 2 do you want to calculate?");
                number = kbd.nextInt();
            }
        }

        System.out.println("Goodbye!");

    }



    public static int getValidInput(){
        Scanner kbd = new Scanner(System.in);

        System.out.println("Which power of 2 do you want to calculate?");
        int number = kbd.nextInt();

        while ( (number != -1) && ((number < 1) || (number > 10)) )
        {
            System.out.println("Invalid input");
            System.out.println("Which power of 2 do you want to calculate?");
            number = kbd.nextInt();
        }
        return number;
    }

    public static void nonNestedPowers() {

        System.out.println("Powers of two! The language of the computer.");
        System.out.println("Enter a non-negative number between 1 and 10 and the program will calculate its power of 2.");
        System.out.println("E.g., 10 => 2^10 = 1024.");
        System.out.println("Enter -1 to leave.");

        int number = getValidInput();

        while(number != -1)
        {
            System.out.println("2^" + number + " = " + Math.pow(2.0, number));
            number = getValidInput();
        }

        System.out.println("Goodbye!");

    }

    public static int getInt(String question)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println(question);
        return kbd.nextInt();

    }

    public static void main(String []args)
    {
        // Hard to read/follow example
        nestedPowers();

        // Easier to read/follow example
        nonNestedPowers();

    }

}
