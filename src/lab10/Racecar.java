package lab10;

public class Racecar extends Car {
    public Racecar() {
        super(200);   // call the Car class constructor
    }

    public void drive() {
        if (currentSpeed + 10 <= topSpeed)
            currentSpeed += 10;

        System.out.println("Driving race car at " + currentSpeed + " mph.");

        // 1 mph = 0.0002777 miles per second
        totalDistanceTraveled += currentSpeed * 0.0002777;
    }
}
