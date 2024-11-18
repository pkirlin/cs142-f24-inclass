package poly1;

public class Sundae {
    protected int numScoops;

    public Sundae(int newScoops) {
        numScoops = newScoops;
    }

    public int getCalories() {
        return 137 * numScoops;
    }
}
