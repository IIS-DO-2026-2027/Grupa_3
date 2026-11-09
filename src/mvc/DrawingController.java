package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import command.AddPointCmd;

public class DrawingController {
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		super();
		this.model = model;
		this.frame = frame;
	}
	
	public void drawPoint(MouseEvent e) {
		Point p = new Point (e.getX(), e.getY(), Color.BLACK);
		//MVC deo:
		//model.add(p);
		
		//Command deo (novo):
		AddPointCmd addPointCmd = new AddPointCmd(p, model);
		addPointCmd.execute();
		frame.repaint();
	}
	
	

}
