package singleton;

public class DatabaseConnectionLazy {
	//2. način - lazy loading
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}
	
	public static DatabaseConnectionLazy getInstance() {
		//synchronized skupa metoda da bi se svaki put pozivala
		if(instance == null) {
			//podrška za paralelno korišćenje (konkurentno programiranje)
			synchronized(DatabaseConnectionLazy.class) {
				if(instance == null)
					instance = new DatabaseConnectionLazy();
			}
		}

		return instance;
	}

}
