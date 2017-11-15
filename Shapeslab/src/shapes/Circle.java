package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double circleA = pi*radius*radius;
		return circleA;
	}

	@Override
	public double calculatePerimeter() {
		double circleP = 2*pi*radius;
		return circleP;
	}

	@Override
	public String toString() {
		return "circle radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
