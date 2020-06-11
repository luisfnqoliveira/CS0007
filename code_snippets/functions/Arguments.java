import java.util.*;
import java.io.*;

class Arguments
{

  public static void sayHello(String name)
  {
    System.out.println("Hello " + name);
    System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
    // -- Hal 9000
  }

  public static void main(String []args)
  {
    Scanner kbd = new Scanner(System.in); // Hey, this is an argument!!

    System.out.println("What's your name?");
    String name = kbd.next();

    sayHello(name);

  }

}
