package adapter;

import hexagon.Hexagon;

public class BoatAdapter implements Vehicle {
	//private Hexagon hexagon;
	private Boat boat;
	
	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}

	@Override
	public void goFaster() {
		boat.rowFaster();
		//hexagon.paint(null);
	}

}
