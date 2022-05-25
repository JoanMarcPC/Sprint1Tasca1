package tasca1n3ex1;

public class NoticiaMoto extends Noticia implements InterfaceNoticia {
private String equip;

	public NoticiaMoto(String titular, String equip) {
	super(titular);
	this.equip = equip;
}
	

	public String getEquip() {
		return equip;
	}


	public void setEquip(String equip) {
		this.equip = equip;
	}


	@Override
	public int calcularPreuNoticia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
