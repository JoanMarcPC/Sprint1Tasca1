package tasca1n1ex1;

public class Percussio extends Instrument {

	public Percussio(String name, float price) {
		super(name, price);
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}
}
