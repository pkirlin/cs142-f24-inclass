package poly3;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(int newBase, int newHeigh) {
        base = newBase;
        height = newHeigh;
    }

    public double getArea() {
        return (1/2.0) * base * height;
    }

    public double getPerim() {
        return Math.sqrt(base * base + height * height) + base + height;
    }
}
