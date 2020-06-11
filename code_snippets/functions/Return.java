import java.util.*;
import java.io.*;

class Return
{

  public static int addTwo(int a, int b)
  {
    return a + b;
    System.out.println("This will never run");
  }

  public static void main(String []args)
  {
    Scanner kbd = new Scanner(System.in); // Hey, this is an argument!!

    System.out.println("Calculator time!");
    System.out.print("Input an addition in the format \"number+number\":");
    int operand1 = kbd.nextInt();
    char operation = kbd.nextChar();
    int operand2 = kbd.nextInt();

    int result;
    boolean invalidOperation = false;
    switch(operation)
    {
      case '+':
          result = addTwo(operand1, operand2);
          break;
      default:
          invalidOperation = true;
          break;
    }

    if(!invalidOperation)
    {
      System.out.println("The result of " + operand1 + operation + operand2 + " is " + result);
    }
    else
    {
      System.out.println("Unknown operation!");
    }

  }

}
