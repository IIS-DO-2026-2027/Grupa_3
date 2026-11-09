package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {
	//izuzetak osnove MVC strukture
	DrawingModel model = new DrawingModel();
	
	public void paint(Graphics g) {
		Iterator<Shape> it = model.getShapes().iterator();
		while(it.hasNext()) 
			it.next().draw(g);
	}

	public void setModel(DrawingModel model) {
		this.model = model;
	}
	
	

}
