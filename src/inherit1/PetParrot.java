package inherit1;

public class PetParrot extends Parrot {
    private String name;

    public void setName(String newName) {
        name = newName;
    }

    public void talk() {
        //int e = getEnergy();
        //e--;
        //setEnergy(e);
        if (energy > 0) {
            energy--;
            System.out.println(name + " is talking!");
        } else {
            System.out.println(name + " is too tired to talk.");
        }
    }
}
