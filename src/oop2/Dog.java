package oop2;

public class Dog {

    private String name;
    private int age;
    private String breed;

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
        return name + " is the name of the dog";
    }

    public void chase(Dog otherDog) {
        System.out.println(name + " chases " + otherDog.name);
    }
}
