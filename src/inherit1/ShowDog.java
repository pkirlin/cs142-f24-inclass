package inherit1;

public class ShowDog extends Dog {
    private int speed;

    public void flip() {
        System.out.println(name + " does a backflip");
    }

    public void speak() {
        super.speak();
        System.out.println(name + " says woof woof in French!");
        super.speak();
    }
}
