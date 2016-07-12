package prob5;

public class RectTriangle extends Shape {

	public RectTriangle(double width, double height) {
		super(width, height, 3);
	}

	@Override
	double getArea() {
		return (width * height) / 2;
	}

	@Override
	double getPerimeter() {
		return width + height + Math.sqrt(width * width + height * height);
	}

}
