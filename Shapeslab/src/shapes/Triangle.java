package shapes;


/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Triangle implements Shape {

	// fields
	private int height;
	private int baselength;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Triangle(int height, int baselength) {
		this.height = height;
		this.baselength = baselength;
	}

	@Override
	public double calculateArea() {
		double triangleA = baselength*height;
		return triangleA;
	}

	@Override
	public double calculatePerimeter() {
		double triangleP = 3*baselength;
		return triangleP;
	}

	@Override
	public String toString() {
		return "triangle height: " + height + " triangle baselength" + baselength + "Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}

