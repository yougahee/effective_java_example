package chapter4.tag;

abstract class AbstractFigure {
	abstract double area();
}

class Circle extends AbstractFigure {

	final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}

class Rectangle extends AbstractFigure {
	final double width;
	final double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width*height;
	}
}
