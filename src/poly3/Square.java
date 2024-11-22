package poly3;

public class Square extends Shape {
    private int sideLength;

    public Square(int newSideLength) {
        sideLength = newSideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerim() {
        return 4 * sideLength;
    }
}
