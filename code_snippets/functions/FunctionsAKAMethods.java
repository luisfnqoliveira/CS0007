import java.util.*;
import java.io.*;

class FunctionsAKAMethods
{

  public static void getNumber()
  {
    Scanner kbd = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = kbd.nextInt();
    System.out.println("Your input was: " + number);
  }

  public static void doSomethingElse()
  {
    System.out.println("Doing some extra work");
    getNumber();
    System.out.println("Extra job's done!");
  }

  public static void doSomething()
  {
    System.out.println("Doing some work");
    doSomethingElse();
    System.out.println("Job's done!");
  }

  public static void main(String []args)
  {
    doSomething();
  }

}
