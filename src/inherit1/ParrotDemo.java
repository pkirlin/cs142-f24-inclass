package inherit1;

import java.awt.*;

public class ParrotDemo {
    public static void main(String[] args) {
        Parrot polly = new Parrot();
        polly.setColor(Color.BLUE);
        polly.setEnergy(3);
        polly.fly();
        polly.fly();
        polly.sleep();

        PetParrot tweety = new PetParrot();
        tweety.setColor(Color.BLUE);
        tweety.setEnergy(3);
        tweety.fly();
        tweety.fly();
        tweety.setName("Tweety");
        tweety.sleep();
        tweety.talk();
        tweety.talk();


    }
}
