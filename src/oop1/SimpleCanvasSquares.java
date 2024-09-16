package oop1;

import java.awt.*;

public class SimpleCanvasSquares {
    public static void main(String[] args) {

        // Use SimpleCanvas to open a new canvas and draw
        // a concentric square design similar to this:
        // https://www.artsy.net/artwork/frank-stella-gran-cairo-4

        SimpleCanvas c = new SimpleCanvas(300,300);
        Color mycolor = new Color(37, 100, 200);
        c.setPenColor(mycolor);
        c.drawFilledRectangle(50, 50, 200, 200);
        Color mycolor2 = new Color(200, 100, 200);
        c.setPenColor(mycolor2);
        c.drawFilledRectangle(100, 100, 100, 100);
        c.show();

    }
}