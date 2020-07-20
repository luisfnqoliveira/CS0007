public class Fraction {

    private int numerator;
    private int denominator;

    // Default constructor
    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int n)
    {
        numerator = n;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int d)
    {
        if(d == 0) {
            System.out.println("Error: Invalid denominator: " + d);
        } else {
            denominator = d;
        }
    }

    public String toString()
    {
        return numerator + "/" + denominator + "=" + (numerator/denominator);
    }


}
