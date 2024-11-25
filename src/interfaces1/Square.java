package interfaces1;

import java.awt.*;

public class Square extends Shape implements Drawable {
    private int sideLength;

    public Square(int newSideLength, Color c) {
        sideLength = newSideLength;
        setColor(c);
    }

    public double getArea() {
        return 0;
    }

    public String toString() {
        return "Square with side length=" + sideLength;
    }

    @Override
    public void drawOn(SimpleCanvas canvas, int locationX, int locationY) {
        canvas.setPenColor(getColor());
        canvas.drawRectangle(locationX, locationY, sideLength, sideLength);
    }
}
