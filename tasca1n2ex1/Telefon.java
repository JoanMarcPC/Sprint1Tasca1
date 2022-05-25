package tasca1n2ex1;

public class Telefon {
	private String marca;
	private String model;

	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void trucar(String num) {
		System.out.println("S'esta trucant al: " + num);
	}
}
