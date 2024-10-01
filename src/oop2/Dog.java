package oop2;

public class Dog {

    private String name;
    private int age;
    private String breed;
    private int energy;

    public Dog() {
        energy = 3;
    }

    public Dog(String newName) {
        name = newName;
        energy = 3;
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

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    void bark() {
        System.out.println(name + " says woof woof");
    }

    public String toString() {
        return name + " is the name of the dog and its energy is " + energy;
    }

    public void chase(Dog otherDog) {
        System.out.println(name + " chases " + otherDog.name);
    }
}
