import java.util.*;
import java.io.*;

class Sentinel
{



    public static void main(String []args)
    {
        Scanner kbd = new Scanner(System.in);


        System.out.println("Powers of two! The language of the computer.");
        System.out.println("Enter a non-negative number and the program will calculate its power of 2.");
        System.out.println("E.g., 10 => 2^10 = 1024.");
        System.out.println("Enter -1 to leave.");

        System.out.println("Which power of 2 do you want to calculate?");
        int number = kbd.nextInt();

        while ( number != -1 )
        {

            System.out.println("2^" + number + " = " + Math.pow(2.0, number));
            System.out.println("Which power of 2 do you want to calculate?");
            number = kbd.nextInt();
        }

        System.out.println("Goodbye!");

    }
}
