package tasca1n1ex1;

public class Vent extends Instrument {

	public Vent(String name, float price) {
		super(name, price);
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}

}
