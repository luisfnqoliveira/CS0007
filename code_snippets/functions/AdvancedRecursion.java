import java.util.*;
import java.io.*;

class AdvancedRecursion
{

  public static void countdown(int number)
  {
    System.out.println(number + "!!!");
    if ( number >= 0 )
    {
      // Recursive case
      countdown(number - 1);
    }
    else
    {
      // Base case
      System.out.println("Happy new year!!!");
    }
  }

  public static void countup(int number)
  {
    System.out.println(number + "!!!");
    if ( number <= 0 )
    {
      // Base case
      System.out.println("Here we go!!!");
    }
    else
    {
      // Recursive case
      countup(number - 1);
    }
    System.out.println(number + "!!!");
  }

  public static void main(String []args)
  {
    countdown();
    countup();
  }

}
