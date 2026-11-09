package command;

import mvc.DrawingModel;
import mvc.Shape;

public class RemoveShapeCmd implements Command {
	private Shape shape;
	private DrawingModel model;

	@Override
	public void execute() {
		model.remove(shape);

	}

	@Override
	public void unexecute() {
		model.add(shape);

	}

}
