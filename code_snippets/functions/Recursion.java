import java.util.*;
import java.io.*;

class Recursion
{

  public static void print()
  {
    // Recursion gone wrong!
    System.out.println("Hello world!")
    print();
  }

  public static void main(String []args)
  {
    print();
  }

}
