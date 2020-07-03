package org.design.pattern.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		
		Shape shape= null;
		
		switch (shapeType) {
		case "CIRCLE":
			shape = new Circle();
			break;
		case "SQUARE":
			shape = new Square();
			break;
		case "RECTANGLE":
			shape = new Rectangle();
			break;	

		default:
			break;
		}
		
		return shape;
		
	}

}
