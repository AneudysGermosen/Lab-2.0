package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(3);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Triangle(rand.nextInt(50), rand.nextInt(50));
		case 4:
			return new Trapezoid(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] shapes) {
		double arrayArea = 0.0; 
		
		for(int x = 0; x < shapes.length; x++)
		{
			arrayArea = arrayArea + shapes[x].calculateArea();
		}
			
		return arrayArea;
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] shapes) {
		double arrayPerimeter = 0.0;

		for(int x = 0; x < shapes.length; x++)
		{
			arrayPerimeter = arrayPerimeter + shapes[x].calculatePerimeter();
		}
		return arrayPerimeter;
	}


	public static void countShape(Shape[] shapes)
	{ int rectangles = 0;
		int circles = 0;
		for (Shape x : shapes)
		{
			if (x instanceof Circle)
			{
				circles++;
			}
			if(x instanceof Rectangle)
			{
				rectangles++;
			}

		}
	System.out.println(circles + "circles found and" + rectangles + "rectangles");
	}




















}
