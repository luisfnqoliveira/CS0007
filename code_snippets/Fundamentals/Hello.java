/*
    Author: Luis Oliveira
    This is a simple example of a Java program
*/
import java.util.*;

public class Hello
{
  public static void main( String[] args )
  {
    // This is the code that will run

    // Constant this value will not change
    final int INCHES_IN_A_FOOT = 12;

    Scanner keyboard = new Scanner(System.in);

    int age = 33;

    System.out.print("Hello, what's your name? ");
    String name = keyboard.next();

    System.out.print("How old are you " + name + "?");
    age = keyboard.nextInt();

    System.out.print("How tall are you " + name + "?");
    int heightInInches = keyboard.nextInt();

    System.out.println("Hello "+name+"!");
    System.out.println("You are " + age + " years old" +
          "and your height is " + heightInInches + "''" );
  }

}
