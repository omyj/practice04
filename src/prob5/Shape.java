package prob5;

public abstract class Shape {
	protected double width;
	protected double height;
	private int countSides;

	public Shape(double width, double height, int countSides) {
		super();
		this.width = width;
		this.height = height;
		this.countSides = countSides;
	}
	public Shape( int countSides ) {
		this.countSides = countSides;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}

	abstract double getArea(); // 넓이

	abstract double getPerimeter(); // 둘레 길이

}
