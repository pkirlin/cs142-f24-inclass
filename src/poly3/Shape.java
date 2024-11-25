package poly3;

import java.awt.*;

public abstract class Shape {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract int getArea();

    public abstract int getPerimeter();

}
