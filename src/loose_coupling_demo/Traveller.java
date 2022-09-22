package loose_coupling_demo;

public class Traveller {
	Vehicle v;

	public Traveller(Vehicle v) {
		super();
		this.v = v;
	}

	public Traveller() {
		super();
		}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	
	public void startJourney() {
		System.out.println("Journey started..");
		v.move();
	}
	
	

}
