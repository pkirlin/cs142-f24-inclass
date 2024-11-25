package poly3;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(int newBase, int newHeigh) {
        base = newBase;
        height = newHeigh;
    }

    public int getArea() {
        return base * height / 2;
    }

    public int getPerimeter() {
        return (int)(base + height + Math.sqrt(base * base + height * height));
    }
}
