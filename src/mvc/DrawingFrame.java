package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame {
	DrawingView view = new DrawingView();
	DrawingController controller;
	
	public DrawingFrame() {
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.drawPoint(e);
			}
		});
		//JPanel panel = new JPanel();
		getContentPane().add(view, BorderLayout.CENTER);
	}

	public void setController(DrawingController controller) {
		this.controller = controller;
	}
	
	

}
