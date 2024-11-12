package inherit1;

import java.awt.*;

public class Parrot {
    protected int energy;
    private Color color;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        energy = newEnergy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color newColor) {
        color = newColor;
    }

    public String toString() {
        return "Parrot object: energy=" + energy + " color=" + color;
    }

    public void fly() {
        // flying takes three units of energy
        if (energy >= 3) {
            energy -= 3;
            System.out.println("The parrot flies!");
        } else {
            System.out.println("The parrot is too tired to fly.");
        }
    }

    public void sleep() {
        System.out.println("Parrot takes a nap.");
        energy++;
    }

}
