package oop2;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Lassie");
        //myDog.setName("Fido");
        myDog.setAge(3);
        myDog.setBreed("Golden retriever");
        System.out.println("My dog's name is " + myDog.getName());
        Dog otherDog = new Dog();
        otherDog.setName("Toto");
        otherDog.setAge(5);
        System.out.println("The other dog's name is " + otherDog.getName());
        Dog dog3 = myDog;
        System.out.println("dog3's name is " + dog3.getName());

        myDog.bark();
        otherDog.bark();
        dog3.bark();
        //Dog.bark();

        myDog.setEnergy(5);
        System.out.println(myDog); // automatically calls myDog.toString()
        myDog.playFetch();
        System.out.println(myDog);

        myDog.chase(otherDog);
        otherDog.chase(myDog);
    }
}
