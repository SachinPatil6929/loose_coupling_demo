package loose_coupling_demo;

public class TestLooseCoupling {
	public static void main(String[] args) {
		Bike bike = new Bike();
		Car car = new Car();
		Helicoptor helicoptor = new Helicoptor();
		
		Traveller traveller = new Traveller();
		traveller.setV(helicoptor);
		
		traveller.startJourney();
	}

}
