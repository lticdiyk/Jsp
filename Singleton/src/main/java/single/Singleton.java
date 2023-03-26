package single;

public class Singleton {

	private static Singleton single = null;
	
	public int number;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(single == null) {
			single = new Singleton();
		}	
		return single;
	}
	
}
