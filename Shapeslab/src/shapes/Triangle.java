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
	public Triangle(int height, int baselength) {  // here i make the variables usable across multiple methods inside a class
		this.height = height;
		this.baselength = baselength;
	}

	@Override
	public double calculateArea() {  // here i calculate the area
		double triangleA = baselength*height;
		return triangleA;
	}

	@Override
	public double calculatePerimeter() { //here i calculate the perimeter of the triangle by multiplying the base by 3 because this is an equalateral   triangle  
		double triangleP = 3*baselength;
		return triangleP;
	}

	@Override
	public String toString() { // here i return the height, base length, area, and perimeter in a formated 
		return "triangle height: " + height + " triangle baselength" + baselength + "Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}

