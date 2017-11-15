package shapes;


/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Trapezoid implements Shape {

	// fields
	private int height;
	private int baselength1;
	private int baselength2;
	private int side1;
	private int side2;

	/**
	 * Constructor method
	 *
	 * @param radius
	 */
	public Trapezoid(int height, int baselength1, int baselength2, int side1, int side2) {
		this.height = height;
		this.baselength1 = baselength1;
		this.baselength2 = baselength2;
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public double calculateArea() {
		double trapezoidA = ((baselength1* baselength2)/2) * height;
		return trapezoidA;
	}

	@Override
	public double calculatePerimeter() {
		double trapezoidP = baselength1 + baselength2 + side1 + side2;
		return trapezoidP;
	}

	@Override
	public String toString() {
		return "trapezoid side1: " + side1 + "trapezoid side2: " + side2 + "trapezoid height: " + height +
				" trapezoid baselength1" + baselength1 + " trapezoid baselength2" + baselength2 + "Area: " + this.calculateArea() +
				" Perimeter: " + this.calculatePerimeter();
	}
}

