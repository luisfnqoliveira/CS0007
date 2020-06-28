import java.util.*;
import java.io.*;

class DoWhile
{


    public static void main(String []args)
    {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Here we go!");

        String answer;

        do
        {
            System.out.println("     o  o");
            System.out.println("  o       o");
            System.out.println("L           o");
            System.out.println("  !       o");
            System.out.println("     p  o");

            System.out.println("Do you want to loop?");
            answer = kbd.next().toLowerCase();
        } while( answer.equals("yes") );

        System.out.println("Goodbye!");

    }
}
