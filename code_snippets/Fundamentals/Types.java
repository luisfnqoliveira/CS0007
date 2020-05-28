/*
    Author: Luis Oliveira
    This is a simple example of a Java program
*/
public class Types {
  public static void main( String[] args )
  {

    byte tiny = 0;
    // tiny can be as small as -128
    tiny = -128;
    // tiny = -129; This will not compile :(
    // tiny can be as large as 127
    tiny = 127;
    // tiny = -128; This will not compile :(

    short small = 0;
    small = -32768; // Cannot write -32,768 with a comma!
    small = 32767;

    int average = 0;
    average = -2147483648; // Cannot write -32,768 with a comma!
    average = 2147483647;

    long large = 0;
    large = -9223372036854775808L; // Cannot write -32,768 with a comma!
    large = 9223372036854775807L; // <- Must sufix with "L" to let java know it's a long literal

    float smallerReals = 0.2F; // <- Must sufix with "F" to let java know it's a float literal
    double largerReals = 0.2;

    char aCharacter = 'A';
    System.out.println("This is aCharacter: " + aCharacter);
    char anotherCharacter = 65;
    System.out.println("This is anotherCharacter: " + anotherCharacter);
    String aBunchOfThem = "Yes, we are!";
    System.out.println("This is aBunchOfThem: " + aBunchOfThem);

    // More on these later
    boolean falsyStatement = 1 == 2; // == -> is it equal?
    boolean truthyStatement = 1 <= 2; // == -> is it equal?

  }
}
