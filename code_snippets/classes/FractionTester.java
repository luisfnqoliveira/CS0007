public class FractionTester {


    public static void main(String[] args) {


        Fraction f = new Fraction();
        Fraction f2 = new Fraction(1, 3);

        f2.setNumerator(3);
        f2.setDenominator(2);


        System.out.println("Fraction f is: " + f);
        System.out.println("Fraction f2 is: " + f2);


    }
}
