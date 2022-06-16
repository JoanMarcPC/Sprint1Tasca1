package tasca1n2ex1;

public class Smartphone extends Telefon implements Rellotge, Camera {

	public Smartphone(String marca, String model) {
		super(marca, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fotografiar() {
		// TODO Auto-generated method stub
		System.out.println("S'està fent una foto");

	}

	@Override
	public void alarma() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant l'alarma");

	}

}
