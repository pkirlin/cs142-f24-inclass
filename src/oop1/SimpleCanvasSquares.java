package oop1;

import java.awt.*;

public class SimpleCanvasSquares {
    public static void main(String[] args) {

        // Use SimpleCanvas to open a new canvas and draw
        // a concentric square design similar to this:
        // https://www.artsy.net/artwork/frank-stella-gran-cairo-4

        SimpleCanvas canvas = new SimpleCanvas(500, 500);
        canvas.drawFilledRectangle(50, 50, 400, 400);
        Color mycolor = new Color(255, 0, 255);
        canvas.setPenColor(mycolor);
        canvas.drawFilledRectangle(100, 100, 300, 300);
        canvas.show();

    }
}