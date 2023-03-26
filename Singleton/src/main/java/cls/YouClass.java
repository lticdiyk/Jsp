package cls;

import single.Singleton;

public class YouClass {

	private String name = "홍두께";
	private int number;
	/*	
	public void setNumber(int number) {
		this.number = number;
	}
	*/
	public void youMethod() {
		Singleton si = Singleton.getInstance();
		number = si.number;
	}

	@Override
	public String toString() {
		return "YouClass [name=" + name + ", number=" + number + "]";
	}
	
	
}
