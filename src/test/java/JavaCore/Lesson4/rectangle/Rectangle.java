package JavaCore.Lesson4.rectangle;

public class Rectangle {


	private double width;
	private double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	public void calculateArea() {
		double calculateArea = width * height;
		System.out.println(calculateArea);
	}

	public void calculatePerimeter() {
		double calculatePerimeter = (width + height) * 4;
		System.out.println(calculatePerimeter);
	}


}


class RectangleTest {


	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 5);
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
	}
}