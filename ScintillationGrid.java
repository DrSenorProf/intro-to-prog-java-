import java.awt.Graphics;
import java.awt.Color;
import java.io.IOException;

/**
 * CS312 Assignment 3.
 *
 * Replace <NAME> with your name, stating on your honor you completed this
 * assignment on your own and that you didn't share your code with other
 * students.
 * 
 * On my honor, Emiliano Villarreal, this programming assignment is my own work
 * and I have not shared my solution with any other student in the class.
 *
 * A program to print out various scintillation grids and a student designed
 * drawing.
 *
 * email address: ev8559@utexas.edu UTEID: ev8559 Number of slip days I am using
 * on this assignment: 0
 */

public class ScintillationGrid {

	// Main method that creates the DrawingPanel with scintillation grids.
	// Restricted to chapters 1 - 3 of Building Java Programs
	public static void main(String[] args) {
		/*
		 * In the final version of the program DO NOT call method drawingOne from main
		 * or anywhere else in the program
		 */
		final int WIDTH = 900;
		final int HEIGHT = 650;
		DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);
		Graphics g = dp.getGraphics();
		dp.setBackground(Color.CYAN);
		// CS312 Students add you four methods calls to draw the four
		// required scintillation grids here.

		squares(g, 0, 0, 348, 348, 3, 75, 16);
		squares(g, 400, 50, 422, 422, 6, 50, 12);
		squares(g, 50, 400, 220, 220, 1, 100, 20);
		squares(g, 500, 500, 148, 148, 7, 15, 4);

		// CS312 students, do not alter the following line of code.
		saveDrawingPanel(dp, "grid.png");
	}

	// method for the student designed drawing
	// NOT restricted to chapters 1 - 3 of Building Java Programs
	// DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!
	public static void drawingOne() {
		// DO NOT ADD ANY PARAMETERS TO THIS METHOD!!!

		// CS312 Students, you may increase the size of the drawing panel if
		// doing a non standard drawing.
		final int WIDTH = 400;
		final int HEIGHT = 200;
		DrawingPanel dp = new DrawingPanel(WIDTH, HEIGHT);

		// CS312 Students, add your code, including method calls here
		DrawingPanel panel = new DrawingPanel(400, 200);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.GREEN);
		g.setColor(Color.RED);
		g.fillOval(0, 0, 200, 100);
		g.fillOval(200, 100, 200, 100);
		g.setColor(Color.BLACK);
		g.drawLine(200, 400, 200, 0);
		g.drawLine(0, 100, 400, 100);
		g.drawLine(0, 50, 200, 50);
		g.drawLine(200, 150, 400, 150);
		g.drawLine(100, 0, 100, 100);
		g.drawLine(300, 100, 300, 200);

		// Do not alter this line of code. It saves the panel to a file for later
		// viewing
		saveDrawingPanel(dp, "drawing_one.png");
	}

	// Save the current drawing panel to the given file.
	// CS312 Students, do not alter this method.
	public static void saveDrawingPanel(DrawingPanel dp, String fileName) {
		try {
			dp.save(fileName);
		} catch (IOException e) {
			System.out.println("Unable to save DrawingPanel");
		}
	}

	/*
	 * This method will use multiple parameters to calculate the exact location of
	 * all the components within the grid
	 */
	public static void squares(Graphics g, int x, int y, int RECT_WIDE, int RECT_HIGH, int NUM_LINES, int SMALL_SQUARE,
			int THICK_LINES) {

		g.setColor(Color.BLACK);
		g.fillRect(x, y, RECT_WIDE, RECT_HIGH);
		int verticalLineSpace = x + SMALL_SQUARE;
		int verticalLineCircle = x + SMALL_SQUARE;
		int horLineSpace = y + SMALL_SQUARE;
		int horLineCircle = y + SMALL_SQUARE;

		// loop that prints out the vertical lines
		for (int lineVert = 1; lineVert <= NUM_LINES; lineVert++) {
			g.setColor(Color.GRAY);
			g.fillRect(verticalLineSpace, y, THICK_LINES, RECT_HIGH);
			verticalLineSpace += SMALL_SQUARE + THICK_LINES;
		}

		// loop that prints out the horizontal lines
		for (int lineHor = 1; lineHor <= NUM_LINES; lineHor++) {
			g.setColor(Color.GRAY);
			g.fillRect(x, horLineSpace, RECT_WIDE, THICK_LINES);
			horLineSpace += SMALL_SQUARE + THICK_LINES;
		}

		// loop that prints out the circles
		for (int circle = 1; circle <= NUM_LINES; circle++) {
			g.setColor(Color.WHITE);
			int addForty = (int) (THICK_LINES + (THICK_LINES * .4));
			int addPixels = THICK_LINES + 2;
			int widhthHeightCircle = Math.max(addForty, addPixels);
			horLineCircle = y + SMALL_SQUARE;
			for (int colunms = 1; colunms <= NUM_LINES; colunms++) {
				g.fillOval(verticalLineCircle - (widhthHeightCircle / 6), horLineCircle - (widhthHeightCircle / 6),
						widhthHeightCircle, widhthHeightCircle);
				horLineCircle += SMALL_SQUARE + THICK_LINES;

			}
			verticalLineCircle += SMALL_SQUARE + THICK_LINES;
		}

	}

}
