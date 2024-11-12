package inherit1;

public class DogDemo {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setAge(2);

        Dog toto = new Dog();
        toto.setName("Toto");
        toto.setAge(3);

        System.out.println(fido);
        System.out.println(toto);

        ShowDog fluffy = new ShowDog();
        fluffy.setAge(5);
        fluffy.setName("Fluffy");

        System.out.println(fluffy);
        fluffy.chase(toto);
        fluffy.flip();

        toto.speak();
        fluffy.speak();
    }
}
