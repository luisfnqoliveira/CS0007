/*
    Author: Luis Oliveira
    This is a simple example of a Java program
*/
public class Operators {
  public static void main( String[] args )
  {

    int a=0, b=0;

    // Assignment operator
    a = 2;
    b = a;
    b = 3;

    // Addition/subtraction operator
    b = b - 2;
    a = b + 3;
    a = a + b;

    // Multiplication/division operator
    b = b * 10;
    a = b * a;
    a = a / 3;

    // Modulus operator
    b = b % 10;
    a = b % a;

    // The increment operators
    /*****CONFUSING INCOMING!***/

    a++;
    ++a; // These are the same as:
    a = a + 1;
    /********* HOWEVER *********/// Here comes comfusing :'D
    b = a++; // Is the same as
    b = a;
    a = a + 1;
    // while
    b = ++a; // Is the same as
    a = a + 1;
    b = a;
    /****************************/


    // Advanced assignments (a is changed!)
    a += 1; // same as a = a + 1;
    a -= 1; // same as a = a - 1;
    a *= 10; // same as a = a * 10;
    a /= 10; // same as a = a / 10;
    a %= 10; // same as a = a % 10;

    // Comparisons
    a = 1;
    b = 2;
    boolean aEqualsB = a == b;
    boolean aDifferentB = a != b;
    boolean aGreaterThanB = a > b;
    boolean aGreaterOrEqualToB = a >= b;
    boolean aLessThanB = a < b;
    boolean aLessOrEqualToB = a <= b;
  }
}
