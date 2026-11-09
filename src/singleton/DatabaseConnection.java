package singleton;

public class DatabaseConnection {
	//1. način - eager loading
	private static DatabaseConnection instance = new DatabaseConnection();
	
	/*public*/ private DatabaseConnection() {
		
	}
	
	// primer neke konekcije na BP
	
	public static DatabaseConnection getInstance() {
		return instance;
	}

}
