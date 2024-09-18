package oop1;

import java.awt.*;

public class SimpleCanvasFades {
    public static void main(String[] args) {

        // Create a 256 by 256 canvas.
        // Use a for loop to draw 256 horizontal lines on the canvas, starting at solid black
        // at the top, and transitioning to solid blue at the bottom.  Use a different color
        // for each line, starting at (0, 0, 0) and ending at (0, 0, 255).
        // See "blue-fade.png" in this folder for what it should look like.

        // How would this work for a canvas twice as big? (512 x 512)

        // Change your program to let the user enter an RGB triple (3 ints) for the color
        // they want to see at the bottom of the screen, and make your canvas fade
        // from black at the top to whatever color the user wants at the bottom.

        SimpleCanvas canv = new SimpleCanvas(256, 256);
        for (int i = 0; i < 256; i++) {
            Color mycolor = new Color(0, 0, i);
            canv.setPenColor(mycolor);
            canv.drawLine(0, i, 255, i);
        }
        canv.show();

        SimpleCanvas canv2 = new SimpleCanvas(512, 512);
        for (int i = 0; i < 512; i+=2) {
            Color mycolor = new Color(0, 0, i/2);
            canv2.setPenColor(mycolor);
            canv2.drawLine(0, i, 512, i);
            canv2.drawLine(0, i+1, 512, i+1);
        }
        canv2.show();

    }
}
