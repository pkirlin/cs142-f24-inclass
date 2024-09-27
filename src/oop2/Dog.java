package oop2;

public class Dog {
    private String name;
    private int age = 1;
    private boolean hasPointyEars;
    private int weight;

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
        return name + " is the name of the dog.";
    }
}
