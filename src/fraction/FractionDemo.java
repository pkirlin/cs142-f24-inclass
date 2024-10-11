package fraction;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f.multiply(f2));
        System.out.println(f.add(f2));
    }
}
