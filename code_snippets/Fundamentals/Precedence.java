/*
    Author: Luis Oliveira
    This is a simple example of a Java program
*/
public class Precedence {
  public static void main( String[] args )
  {
    int value = 0;

    value = 2 + 10 * -2;
    System.out.println( value );

    value = 2 + 10 * 55 / 10;
    System.out.println( value );

    value = 2 + 55 / 10 * 10;
    System.out.println( value );

    value = 72 / 60 + 72 % 60;
    System.out.println( value );

    value = 15 * 10 % 2 + 10;
    System.out.println( value );


    int intResult = 2 + 55 / 10 * 10;
    System.out.println( intResult );

    double doubleResult = 2 + 55 / 10.0 * 10;
    System.out.println( doubleResult );

  }
}
