package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		
		Boat boat = new Boat();
		BoatAdapter boatAdapter = new BoatAdapter(boat);
		
		car.goFaster();
		plane.goFaster();
		train.goFaster();
		//boat.rowFaster();
		boatAdapter.goFaster();
		
		BoatAdapter2 boatAdapter2 = new BoatAdapter2();
		boatAdapter.goFaster();

	}

}
