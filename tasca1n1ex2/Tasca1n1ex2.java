package tasca1n1ex2;

public class Tasca1n1ex2 {
	public static void main(String[] args) {

		Coche.frenar(); // en una crida de metode static no cal crear objecte

		Coche coche = new Coche(1000);
		coche.accelerar(); // per cridar un metode no static de la classe, cal crear un objecte

	}

}
