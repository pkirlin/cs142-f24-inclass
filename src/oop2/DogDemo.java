package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Fido";
        myDog.age = 3;
        myDog.breed = "Golden retriever";
        System.out.println("My dog's name is " + myDog.name);
        Dog otherDog = new Dog();
        otherDog.name = "Toto";
        otherDog.age = 5;
        System.out.println("The other dog's name is " + otherDog.name);
        Dog dog3 = myDog;
        System.out.println("dog3's name is " + dog3.name);

        myDog.bark();
        otherDog.bark();
        dog3.bark();

        System.out.println(myDog); // automatically calls myDog.toString()
    }
}
