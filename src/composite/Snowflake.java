package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import mvc.Shape;

public class Snowflake extends Shape {
	
	ArrayList<Shape> snowflake = new ArrayList<Shape>();
	
	public void add(Shape s) {
		snowflake.add(s);
	}
	
	public void remove(Shape s) {
		snowflake.remove(s);
	}

	@Override
	public void draw(Graphics g) {
		Iterator<Shape> it = snowflake.iterator();
		while(it.hasNext())
			it.next().draw(g);
	}

}
