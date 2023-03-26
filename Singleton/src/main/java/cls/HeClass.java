package cls;

import single.Singleton;

public class HeClass {

	private int number;
	
	public HeClass() {
	}
	
	public void func() {
		Singleton si = Singleton.getInstance();
		number = si.number;
	}

	@Override
	public String toString() {
		return "HeClass [number=" + number + "]";
	}
	
	
}
