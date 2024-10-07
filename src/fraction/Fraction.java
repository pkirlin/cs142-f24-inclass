package fraction;

public class Fraction {
    private int numer, denom;

    public Fraction(int newNumer, int newDenom) {
        numer = newNumer;
        denom = newDenom;
        if (denom < 0) {
            numer = -numer;
            denom = -denom;
        }
        int gcd = ExtraMath.gcd(numer, denom);
        numer = numer / gcd;
        denom = denom / gcd;
    }

    public String toString() {
        return numer + "/" + denom;
    }

    public Fraction multiply(Fraction otherFraction) {
        int newNumer = numer * otherFraction.numer;
        int newDenom = denom * otherFraction.denom;
        Fraction answer = new Fraction(newNumer, newDenom);
        return answer;
    }

    public Fraction add(Fraction otherFraction) {
        int newNumer = numer * otherFraction.denom + denom * otherFraction.numer;
        int newDenom = denom * otherFraction.denom;
        Fraction answer = new Fraction(newNumer, newDenom);
        return answer;
    }
}
