package prob5;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(double width, double height) {
		super(width, height, 4);
	}

	@Override
	public void resize(double rate) {
		width *= rate;
		height *= rate;
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		return width * 2 + height * 2;
	}

}
