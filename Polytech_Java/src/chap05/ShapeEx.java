package chap05;

class Shape{
	void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	@Override
	void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}	
}

public class ShapeEx {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		Shape shape = new Line();
		shape.draw();
	}

}
