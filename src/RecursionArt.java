/**
 * A program to recursively create fractal patterns
 *
 * @author N. Namasivayam & Z. Blick
 * @version 2023
 */
public class RecursionArt {
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 500;

    private Turtle turtle;

    public RecursionArt() {
        // The turtle starts in the middle of the window facing up
        this.turtle = new Turtle(WINDOW_WIDTH/2, WINDOW_HEIGHT/2, 90);

        // The window's x and y axes go from 0-500
        this.turtle.setXscale(0, 500);
        this.turtle.setYscale(0, 500);
    }


    /**
     * Displays everything drawn by the turtle to the window
     */
    public void show() {
        this.turtle.show();
    }

    /**
     * Sets the position of the turtle in the window
     * @param x The x position of the turtle
     * @param y The y position of the turtle
     */
    public void setTurtlePosition(double x, double y) {
        this.turtle.setPosition(x, y);
    }

    /**
     * Creates a triangle
     * @param sideLength Length of the triangle's side
     */
    public void triangle(int sideLength) {
        for(int i=0; i<3; i++) {
            turtle.goForward(sideLength);
            turtle.turnLeft(120.0);
        }
    }

    /**
     *
     * @param length The length of one side of the spiral
     * @param angle The angle to turn before drawing the next side
     * @param multiplier The amount the side length changes in each turn
     */
    public void spiral(double length, int angle, double multiplier) {
        // TODO: Create spiral function
    }

    /**
     *
     * @param length The length of the branch
     * @param angle The angle to turn for the next branch
     * @param height The number of branches above the current one
     */
    public void tree(double length, int angle, int height) {
        // TODO: Create tree function
    }

    /**
     * A helper function to draw a single side of the koch snowflake
     * @param sideLength The total length of the side
     * @param order The number of sub triangles on this side
     */
    public void kochSide(int sideLength, int order) {
        // TODO: Create koch helper function
    }

    /**
     * The main function to create the koch snowflake
     * @param sideLength The total length of a side
     * @param order The number of sub triangles
     */
    public void koch(int sideLength, int order) {
        // TODO: Create koch function
    }

    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();

        RecursionArt ra = new RecursionArt();
        ra.triangle(100);

        // TODO: Test your functions

        ra.show();
    }
}
