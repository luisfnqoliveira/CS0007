
import java.io.*;
import java.util.*;


class Stamps
{


    /*
     * Packaging cost:
     *
     * | < 2  lb  | $5 (flat rate)  |
     * | < 6  lb  | $5 + 1.5/lb     |
     * | < 10 lb | $11 + 1.25/lb    |
     * | > 10 lb | $16 + 1/lb       |
     */

    public static void main(String []args)
    {

        System.out.println("How much does your package weigh?");
        Scanner kbd = new Scanner(System.in);
        double weight = kbd.nextDouble();

        double total = 0.0;

        System.out.println("The weight is: " + weight);
        if( weight<=0 ){
            System.out.println("Sure it is... come back another time!");
        }
        else if (weight < 2)
        {
            total = 5.0;
        }
        else if (weight < 6)
        {
            // total = 5 (flat rate) + $1.5 for every pound over 2
            total = 5.0 + 1.5*( weight-2 );
        }
        else if (weight < 10)
        {
            // total = 5 (first 2 pounds) + 1.5*4 (for pounds up to 6) + 1.25* pounds above 6
            // total = 11 (for the first 6 pounds) + 1.25* pounds above 6
            total = 11.0 + 1.25*(weight - 6.0);
        }
        else // if(weight >= 10)
        {
            // total = 16 (for the first 10 pounds) + 1.0* pounds above 10
            total = 16.0 + 1.0*(weight-10.0);
        }

        System.out.println("For that weight, the total is: $" + total);

    }


}
