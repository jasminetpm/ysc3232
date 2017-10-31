package model;

import java.awt.Point;

public class Triangle {
	
<<<<<<< HEAD
	private Point[] points;

	/**
	 * Constructor for a triangle
	 * @param x1 the X coordinate of the first point
	 * @param y1 the Y coordinate of the first point
	 * @param x2 the X coordinate of the second point
	 * @param y2 the Y coordinate of the second point
	 * @param x3 the X coordinate of the third point
	 * @param y3 the Y coordinate of the third point
	 */
=======
	private Point p1;
	private Point p2;
	private Point p3;
	
>>>>>>> experimental
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.points = new Point[3];
		this.points[0] = new Point(x1, y1);
		this.points[1] = new Point(x2, y2);
		this.points[2] = new Point(x3, y3);
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
	}
	
	public Point getFirstPoint()
	{
		return this.points[0];
		return this.p1;
	}
	
	public Point getSecondPoint()
	{
		return this.points[1];
	}

	public Point getSecondPoint()
	{
		return this.p2;
	}
}
