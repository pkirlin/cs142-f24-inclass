package fraction;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction f = new Fraction(2, 3);
        Fraction f2 = new Fraction(-2, 3);
        Fraction f3 = new Fraction(3, 8);
        System.out.println(f);
        //f.setNumerator(1);
        System.out.println(f2);
        System.out.println(f2.multiply(f3));
        System.out.println(f2.add(f3));
    }
}
