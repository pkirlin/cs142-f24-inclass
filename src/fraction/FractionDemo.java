package fraction;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction f = new Fraction(2, 3);
        Fraction f2 = new Fraction(6, 8);
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f.multiply(f2));
    }
}
