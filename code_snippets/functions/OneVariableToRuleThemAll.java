import java.util.*;
import java.io.*;

class OneVariableToRuleThemAll
{
  // This variable is visible in all functions in this class
  public static boolean oneRing = true;

  public static void setOne()
  {
    oneRing = true;
  }

  public static void resetOne()
  {
    oneRing = false;
  }

  public static void isTheOne()
  {
    if ( oneRing )
    {
      System.out.println("Yup! It's the one!");
    }
    else
    {
      System.out.println("Nope! It's not the one!");
    }
  }

  public static void main(String []args)
  {
    isTheOne();
    resetOne();
    isTheOne();
    setOne();
    isTheOne();

  }

}
