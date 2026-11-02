package mvc;

import java.util.ArrayList;

public class DrawingModel {
	
	private ArrayList<Point> points = new ArrayList<Point>();

	public void add(Point p) {
		points.add(p);
	}
	
	public void remove(Point p) {
		points.remove(p);
	}
	
	public void get(int index) {
		points.get(index);
	}
	
	public ArrayList<Point> getShapes() {
		return points;
	}
}
