import java.util.*;
import java.io.*;

class FunctionsAKAMethods
{

  public static void doSomething()
  {
    System.out.println("Doing some work");
    int hiImAVariable = 2; // It's really a different variable!
    System.out.println("Hello variable: " + hiImAVariable);
    System.out.println("Job's done!");
  }

  public static void doSomethingElse()
  {
    System.out.println("Doing some work");
    int hiImAVariable = 4; // It's really a different variable!
    System.out.println("Hello variable: " + hiImAVariable);
    System.out.println("Job's done!");
  }

  public static void main(String []args)
  {
    int hiImAVariable = 1;
    System.out.println("Hello variable: " + hiImAVariable);
    doSomething();
    hiImAVariable = 3;
    System.out.println("Hello variable: " + hiImAVariable);
    doSomethingElse();
  }

}
