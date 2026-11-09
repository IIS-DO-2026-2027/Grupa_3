package command;

import mvc.Point;

public class UpdatePointCmd implements Command {
	Point point;
	Point newState;
	Point oldState = new Point();

	public UpdatePointCmd(Point point, Point newState) {
		this.point = point;
		this.newState = newState;
	}

	@Override
	public void execute() {
		/*oldState = point;
		point = newState;*/
		
		//izmena se vrši na niovu primitivnih obeležja
		oldState.setX(point.getX());
		oldState.setY(point.getY());
		oldState.setColor(point.getColor());
		
		point.setX(newState.getX());
		point.setY(newState.getY());
		point.setColor(newState.getColor());
	}

	@Override
	public void unexecute() {
		//point = oldState;
		
		point.setX(oldState.getX());
		point.setY(oldState.getY());
		point.setColor(oldState.getColor());
	}

}
