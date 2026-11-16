package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;
import composite.Snowflake;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		super();
		this.model = model;
		this.frame = frame;
	}
	
	//Testiranje MVC i Command obrasca
	public void drawPoint(MouseEvent e) {
		Point p = new Point (e.getX(), e.getY(), Color.BLACK);
		//MVC deo:
		//model.add(p);
		
		//Command deo (novo):
		AddPointCmd addPointCmd = new AddPointCmd(p, model);
		addPointCmd.execute();
		frame.repaint();
	}
	
	//Testiranje Composite obrasca
	public void drawComposite(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		//Proizvoljan oblik
		Line line1 = new Line(
				new Point(x-40, y, Color.BLUE),
				new Point(x+40, y, Color.BLUE),
				Color.BLUE);
		
		Line line2 = new Line(
				new Point(x-20, y-35, Color.BLUE),
				new Point(x+20, y+35, Color.BLUE),
				Color.BLUE);
		
		Line line3 = new Line(
				new Point(x-20, y+35, Color.BLUE),
				new Point(x+20, y-35, Color.BLUE),
				Color.BLUE);
		
		Snowflake snowflake = new Snowflake();
		snowflake.add(line1);
		snowflake.add(line2);
		snowflake.add(line3);
		
		model.add(snowflake);
		//AddShapeCmd addShapeCmd = new AddShapeCmd(model, snowflake);
		//addShapeCmd.execute();
		frame.repaint();
		
	}
	
	

}
