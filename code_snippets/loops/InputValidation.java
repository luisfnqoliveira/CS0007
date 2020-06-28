import java.util.*;
import java.io.*;

class InputValidation
{



    public static int selectInRange(int start, int end)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Select a number between " + start + " and " + end + ":");
        int number = kbd.nextInt();
        while(number<start || number>end)
        {
            System.out.println("Wrong number! Try again!");
            number = kbd.nextInt();
        }
        return number;
    }

    public static int selectAndBreak(int start, int end)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Select a number between " + start + " and " + end + ":");
        int number = kbd.nextInt();
        while(true)
        {
            if(number>=start || number<=end)
            {
                break;
            }
            System.out.println("Wrong number! Try again!");
            number = kbd.nextInt();
        }
        return number;
    }


    public static String selectInRangeTriesBreak(int start, int end, int nTries)
    {

        int color;
        int tries = 0;
        do {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Select a color:");
            System.out.println("    1. Blue");
            System.out.println("    2. Yellow");
            System.out.println("    3. Purple");
            color = kbd.nextInt();
            tries++;
            if ((color>=1) && (color<=3))
            {
                // This is hard to read, and it's usually better to avoid :(
                break; // As soon as the color is valid, leave
            }
            System.out.println("Invalid input!");
        } while (tries <= nTries);

        switch(color)
        {
            // Base cases
            case 1:
                return "blue";
            case 2:
                return "yellow";
            case 3:
                return "purple";
        }
        return "unknown";
    }


    public static String selectInRangeTries(int start, int end, int nTries)
    {

        int color;
        int tries = 0;
        boolean validColor;
        do {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Select a color:");
            System.out.println("    1. Blue");
            System.out.println("    2. Yellow");
            System.out.println("    3. Purple");
            color = kbd.nextInt();
            tries++;
            validColor = (color>=1) && (color<=3);
            if(!validColor) {
                System.out.println("Invalid input!");
            }
        } while ( (tries <= nTries) && !validColor ) ;

        switch(color)
        {
            // Base cases
            case 1:
                return "blue";
            case 2:
                return "yellow";
            case 3:
                return "purple";
        }
        return "unknown";
    }

    public static void main(String []args)
    {
        System.out.println("Number: " + selectInRange(1, 100) );
        System.out.println("Number: " + selectAndBreak(1, 100) );
        System.out.println("Color: " + selectInRangeTries(1, 100, 5) );
        System.out.println("Color: " + selectInRangeTriesBreak(1, 100, 5) );
    }

}
