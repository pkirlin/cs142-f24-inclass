package inherit1;

public class PetParrot extends Parrot {
    private String name;

    public void setName(String newname) {
        name = newname;
    }

    public void talk() {
        //int e = getEnergy();
        //e--;
        //setEnergy(e);
        if (energy >= 1) {
            energy--;
            System.out.println(name + " says hello!");
        } else {
            System.out.println(name + " is too tired.");
        }
    }

    public void sleep() {
        energy++;
        System.out.println(name + " is sleeping.");
    }
}
