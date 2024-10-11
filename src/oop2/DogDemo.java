package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog(10);
        System.out.println(fido);
        //fido.age = 3;
        fido.setName("Fido");
        System.out.println(fido);
        fido.setHasPointyEars(true);
        fido.setWeight(100);
        System.out.println("My dog is named " + fido.getName());
        System.out.println("and his age is " + fido.getAge());
        Dog otherDog = new Dog();
        otherDog.setName("Toto");
        otherDog.setAge(5);
        System.out.println("The other dog is named " + otherDog.getName());
        System.out.println(otherDog);
        Dog dog3 = fido;
        System.out.println("Dog 3 is named " + dog3.getName());

        fido.bark();
        otherDog.bark();
        dog3.bark();

        fido.setEnergy(5);
        System.out.println(fido);
        System.out.println(otherDog);
        fido.playFetch();
        System.out.println(fido);

        fido.chase(otherDog);
        otherDog.chase(fido);
    }
}
