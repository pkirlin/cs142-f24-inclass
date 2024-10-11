package oop2;

public class Dog {
    private String name;
    private int age = 1;
    private boolean hasPointyEars;
    private int weight;
    private int energy;

    private static int totalNumberOfDogs = 0;

    public Dog() {
        age = 3;
        hasPointyEars = false;
        weight = 5;
        energy = 5;
        totalNumberOfDogs++;
    }

    public Dog(int newEnergy) {
        age = 3;
        hasPointyEars = false;
        weight = 5;
        energy = newEnergy;
        totalNumberOfDogs++;
    }

    public void playFetch() {
        if (energy > 0) {
            System.out.println(name + " is playing fetch");
            energy--;
        } else {
            System.out.println(name + " is too tired to play fetch");
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        if (newEnergy >= 0) {
            energy = newEnergy;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasPointyEars(boolean hasPointyEars) {
        this.hasPointyEars = hasPointyEars;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean hasPointyEars() {
        return hasPointyEars;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void chase(Dog otherDog) {
        System.out.println(name + " is chasing " + otherDog.name);
    }

    public void bark() {
        if (weight < 60) {
            System.out.println(name + " says yip yip!");
        } else {
            System.out.println(name + " says woof woof");
        }
    }

    public String toString() {
        return name + " is the name of the dog and its energy is " + energy
                + " and total dogs = " + totalNumberOfDogs;
    }
}
