package tasca1n1ex1;

public abstract class Instrument {
	private String name;
	private float price;

	static int variableStaticInstrument;
	// Variable-atribut? que pertany a la classe i no als objectes d'aquesta
	// classe (ser� com� a tots els objectes)

	static {
		// bloc static nom�s s'executa 1 cop, quan s'instancia la Classe o es modifica
		// algun valor static o es crida un metode static
		System.out.println("bloc static Instrument");
	}

	{
		// bloc inicialitzaci� s'executa cada cop que es crea un objecte de la classe
		System.out.println("bloc inicialitzaci� Instrument");
	}

	public Instrument(String name, float price) {
		this.name = name;
		this.price = price;
		System.out.println("Constructor Instrument");
	}

	static public void metodeStatic() {
		// no pot accedir als atributs de la classe, ja que pot ser cridat sense objecte
		// creat. si que pot accedir als atributs static
		System.out.println("M�tode Static");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public abstract void tocar(); // un metode final no permet la sobreescritura en les classes filles
}
