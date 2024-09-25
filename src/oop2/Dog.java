package oop2;

public class Dog {
    String name;
    int age = 1;
    boolean hasPointyEars;
    int weight;

    void bark() {
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
