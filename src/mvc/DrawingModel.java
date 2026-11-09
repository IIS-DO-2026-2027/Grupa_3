package mvc;

import java.util.ArrayList;

public class DrawingModel {
	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	public void add(Shape shape) {
		shapes.add(shape);
	}
	
	public void remove(Shape shape) {
		shapes.remove(shape);
	}
	
	public void get(int index) {
		shapes.get(index);
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
}
