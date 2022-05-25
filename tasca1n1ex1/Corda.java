package tasca1n1ex1;

public class Corda extends Instrument {
	static int variableStaticCorda;
	static {
		System.out.println("bloc static Corda");
	}

	{
		System.out.println("bloc inicialització Corda ");
	}

	public Corda(String nom, float price) {
		super(nom, price);
		System.out.println("Constructor Corda ");
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de corda");

	}
}
