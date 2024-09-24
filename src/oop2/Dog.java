package oop2;

public class Dog {
    String name;
    int age;
    String breed;

    void bark() {
        System.out.println(name + " says woof woof");
    }

    public String toString() {
        return name + " is the name of the dog";
    }
}
