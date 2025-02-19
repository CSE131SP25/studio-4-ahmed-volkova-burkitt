package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledSquare(0.5, .5, 0.07);
		StdDraw.setPenRadius(0.08);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.square(0.5, 0.5, 0.2);
		StdDraw.setPenColor(30,0,50);
		StdDraw.setPenRadius(0.07);
		StdDraw.ellipse(.5, 0.5, 0.5, 0.5);
	}
}