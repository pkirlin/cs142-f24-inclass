package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog();
        //fido.age = 3;
        fido.name = "Fido";
        fido.hasPointyEars = true;
        System.out.println("My dog is named " + fido.name);
        System.out.println("and his age is " + fido.age);
        Dog otherDog = new Dog();
        otherDog.name = "Toto";
        otherDog.age = 5;
        System.out.println("The other dog is named " + otherDog.name);
        Dog dog3 = fido;
        System.out.println("Dog 3 is named " + dog3.name);

        fido.bark();
        otherDog.bark();
        dog3.bark();

        System.out.println(fido);
    }
}
