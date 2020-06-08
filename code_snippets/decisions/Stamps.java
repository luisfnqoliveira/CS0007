
import java.io.*;
import java.util.*;


Packaging cost:

| < 2lb  | $5 (flat rate)   |
| < 6lb  | $5 + 1.5/lb      |
| < 10lb | $11 + 1.25/lb    |
| > 10lb | $16 + 1/lb       |
class Stamps
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("How much does your package weigh?: ");
        double weight = kdb.nextDouble();

        double total = 0;

        if(weight <= 0)
        {
            System.out.println("Sure it is! Goodbye!");
        }
        else if(weight < 2) // <2 => $5
        {
            System.out.println("red");
        }
        else if(weight < 6) // <6 => $5 + 1.5/lb
        {
            System.out.println("purple");
        }
        else if(weight < 10) // <10 => $11 + 1.25/lb
        {
            System.out.println("purple");
        }
        else // $16 + $1/lb
        {
            System.out.println("who knows?");
        }

        if (total != 0) {
            System.out.println("Your total cost is: $" + total);
        }
    }

}
