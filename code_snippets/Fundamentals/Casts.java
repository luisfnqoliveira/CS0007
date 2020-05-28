/*
    Author: Luis Oliveira
    This is a simple example of a Java program
*/
public class Casts {
  public static void main( String[] args )
  {
    byte aByte = 0;
    short aShort = 0;
    int anInt = 0;
    long aLong = 0;
    float aFloat = 0.0F;
    double aDouble = 0.0F;

    /***********************************
     *   Type conversions are weird    *
     ***********************************/
    // Integer types smaller than int, and converted to int O.o
    anInt = aByte + 10;
    anInt = aByte + aByte;
    anInt = aByte + aShort;
    anInt = aShort + aShort;
    // Types larger than int keep their type
    aLong = aByte + aLong;
    aLong = aShort + aLong;
    aLong = anInt + aLong;
    aLong = aLong + aLong;

    // Floats are kept floats
    aFloat = aFloat + aFloat;
    // Doubles are kept floats
    aDouble = aDouble / aDouble;
    // Mix them, the largest type is maintained
    aDouble = aDouble / aFloat;
    aDouble = aDouble / 10.0;

    // You can force Java to convert to a smaller type. But remember uncle Ben: With great power...
    anInt = 100;
    aByte = (byte)anInt;
    System.out.println("This int " + anInt + " jammed into a byte: " + aByte);

    aByte = 100;
    aByte = (byte)(aByte*aByte);
    System.out.println("100*100 jammed into a byte: " + aByte);

    anInt = 200;
    aByte = (byte)anInt;
    System.out.println("This int " + anInt + " jammed into a byte: " + aByte);

    aDouble = 12.25;
    anInt = (byte)aDouble;
    System.out.println("This double " + aDouble + " jammed into an int: " + anInt);

  }
}
