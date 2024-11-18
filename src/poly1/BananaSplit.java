package poly1;

public class BananaSplit extends Sundae {
    private int numBananas;

    public BananaSplit(int scoops, int bananas) {
        super(scoops);
        numScoops = scoops;
        numBananas = bananas;
    }

    public int getCalories() {
        return super.getCalories() + (90 * numBananas);
    }
}
