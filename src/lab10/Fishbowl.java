package lab10;

import java.util.ArrayList;

/**
 * A fishbowl represents an environment in which our fish swim.
 */
public class Fishbowl {

    /**
     * This list stores all the fish in the fishbowl.
     */
    private ArrayList<Fish> fishes;

    /**
     * The canvas where we draw the fish.
     */
    private SimpleCanvas canvas;

    /**
     * Create a new fishbowl.  We add the number of fish according to the "numfish" parameter.
     */
    public Fishbowl(int numfish) {
        fishes = new ArrayList<Fish>();
        canvas = new SimpleCanvas(800, 600);

        /** Add the appropriate number of fish. */
        for (int i = 0; i < numfish; i++) {
            int size = (int) (Math.random() * 80 + 20);  // random size
            int x = (int) (Math.random() * canvas.getWidth());  // random location
            int y = (int) (Math.random() * canvas.getHeight());
            Fish f = new Fish(size, x, y);
            fishes.add(f);
        }
    }

    /**
     * Begin the game.
     */
    public void runGame() {

        canvas.show();
        int points = 0;  // initialize the number of points we have to zero.
        long timeStart = System.currentTimeMillis();

        while (points < 25) {

            // Move each fish.
            for (Fish fish : fishes) {
                fish.move(canvas.getWidth(), canvas.getHeight());
            }

            draw(); // draw the fish on the canvas
            canvas.pause(20);  // pause so we can see them for a split second

            if (canvas.isMousePressed()) { // detect a mouse click
                for (int i = 0; i < fishes.size(); i++) {
                    Fish fish = fishes.get(i);
                    // Figure out if the mouse has clicked on a fish.
                    if (fish.isClickWithinBoundary(canvas.getMouseClickX(), canvas.getMouseClickY())) {
                        int pointsEarned = fish.getPoints();
                        points += pointsEarned;
                        System.out.println("You caught: " + fish);
                        System.out.println("You earned " + pointsEarned + " points; you have " + points + " total.");

                        // Remove the caught fish from the fishbowl.
                        fishes.remove(i);

                        // Replace the fish caught with a new one.
                        int size = (int) (Math.random() * 80 + 20);
                        int x = (int) (Math.random() * canvas.getWidth());
                        int y = (int) (Math.random() * canvas.getHeight());
                        fishes.add(new Fish(size, x, y));
                    }
                }
            }
        }
        System.out.println("You win the game!");
        long timeFinish = System.currentTimeMillis();
        System.out.println("It took you " + (timeFinish - timeStart) / 1000 + " seconds!");
    }

    /**
     * Draw the fish on the canvas.
     */
    private void draw() {
        canvas.clear();

        // loop over each fish and draw it.
        for (Fish fish : fishes) {
            int x = fish.getLocationX();
            int y = fish.getLocationY();
            int size = fish.getSize();

            // draw the fix on the canvas.  x & y are the upper left corner of the fish picture,
            // and size, size is used for the width and height of the picture (so it's a square).
            canvas.drawImage(x, y, fish.getImageFilename(), size, size);
        }

        canvas.update();
    }
}
