package shapes;

public class Square extends Rectangle {

	private int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}

	public double calculateArea(){
		double squareA = side * side;
		return squareA;
	}

	public double calculatePerimeter(){
		double squareP = side * 4;
		return squareA;
	}
	@Override
	public String toString() {
		return "square side: " + side + "Area: " + this.calculateArea() + "Perimeter: " + this.calculatePerimeter();
	}

}
