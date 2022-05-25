package tasca1n1ex1;

public class Tasca1n1 {
	public static void main(String[] args) { // El metode main es static perque així es pot cridar sense haver de crear
												// un objecte de la classe a la que pertany

		Instrument.metodeStatic();
		// executa el bloc static (si no s'ha executat ja) i despres el metode static de
		// la classe

		Instrument.variableStaticInstrument = 10;
		// executa només bloc static Instrument(si no
		// s'ha executat ja)

		Corda.variableStaticCorda = 0;
		// executa bloc static Superclasse Instrument(si no
		// s'ha executat ja) i executa bloc static Subclasse Corda

		Corda violi = new Corda("violi", 500);
		// executa bloc static i inicialització Instrument i executa bloc static Subclasse Corda
		// (si no s'han executat ja) + bloc inicialització Superclasse Instrument +
		// Constructor Instrument + bloc inicialització Corda + Constructor Corda

		Vent trompeta = new Vent("trompeta", 150);
		Percussio bateria = new Percussio("bateria", 250);

		violi.tocar();
		trompeta.tocar();
		bateria.tocar();

	}
}
