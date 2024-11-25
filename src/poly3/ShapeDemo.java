package poly3;

import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {
        Square sq = new Square(4);
        Triangle tri = new Triangle(3, 5);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(sq);
        shapes.add(tri);
        int totalArea = 0;
        int totalPerim = 0;
        for (Shape s : shapes) {
            totalArea += s.getArea();
            totalPerim += s.getPerimeter();
        }
        System.out.println("total area is " + totalArea);
        System.out.println("total perimeter is " + totalPerim);
    }
}
