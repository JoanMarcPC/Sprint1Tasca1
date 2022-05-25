package tasca1n1ex2;

public class Coche {
private static final String marca;
private static String model= "";
private final int potencia;

static {
	marca = "Opel";
	model = "Astra";
}

public Coche (int potencia) {
	this.potencia = potencia;
}

public static String getModel() {
	return model;
}

public static void setModel(String model) {
	Coche.model = model;
}

public static String getMarca() {
	return marca;
}

public int getPotencia() {
	return potencia;
}

public void accelerar() {
	System.out.println("El vehicle esta accelerant");
}

public static void frenar() {
	System.out.println("El vehicle està frenant");
}

}

