
import java.util.*;

public class Scopes{

    public static void main(String []args)
    {                                                                               // main scope
        System.out.println("Input a number that is less than ten!");

        Scanner kbd = new Scanner(System.in);                                       // kbd is in the main scope
        int number = kbd.nextInt();                                                 // number is in the main scope
        int anotherNumber = 0;                                                      // anotherNumber is in the main scope
        if ( number <= 10 )
        {                                                                           // if scope -> knows about the main scope
            double realNumber = 0.0;                                                // realNumber is in the if scope
            anotherNumber = number;                                                 // anotherNumber is in the main scope: It is visible here,
                                                                                    //      and changes will be visible
            System.out.println("I know about number. Number is: " + number);
            System.out.println("I know about realNumber. realNumber is: " + realNumber);
        }                                                                           // end of if scope, realNumber is gone!
        else
        {                                                                           // else scope
            double realNumber = 0.0;                                                // realNumber is in the else scope, it does not conflict with the one in the if
                                                                                    //      because they are in different scopes
            anotherNumber = 10;                                                     // anotherNumber is in the main scope: It is visible here,
                                                                                    //      and changes will be visible
            System.out.println("That is not what I asked, but I fixed it for you!");
            System.out.println("I know about number. Number is: " + number);
            System.out.println("I know about realNumber. realNumber is: " + realNumber);
        }                                                                           // end of else scope, realNumber is gone!
        // realNumber = 1.0; Will give you an error, it's not known!
        System.out.println("I know about anotherNumber. anotherNumber is: " + anotherNumber);

    }                                                                               // end of main scope
}
