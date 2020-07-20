import java.util.*;
import java.io.*;

class InputValidation
{



  public static int getNumber_1_100()
  {
    Scanner kbd = new Scanner(System.in);
    System.out.println("Select a number between 1 and 100:");
    int number = kbd.nextInt();
    if(number<1 || number>100)
    {
      // Recursive case
      System.out.println("Wrong number! Try again!");
      return getNumber_1_100();
    }
    // Base case
    return number;

  }

  public static String selectColor()
  {
    Scanner kbd = new Scanner(System.in);
    System.out.println("Select a color:");
    System.out.println("    1. Blue");
    System.out.println("    2. Yellow");
    System.out.println("    3. Purple");
    int color = kbd.nextInt();
    switch(color)
    {
        // Base cases
        case 1:
          return "blue";
        case 2:
          return "yellow";
        case 3:
          return "purple";
        // Recursive case
        default:
          System.out.println("Invalid color! Try again!");
          return selectColor();
    }
  }

  public static void main(String []args)
  {
    System.out.println("Number: " + getNumber_1_100() );
    System.out.println("Color: " + selectColor() );
  }

}
