package inherit1;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.fly();

        PetParrot tweety = new PetParrot();
        tweety.setName("Tweety");
        tweety.setEnergy(1);
        tweety.talk();
        tweety.sleep();
        tweety.talk();
    }
}
