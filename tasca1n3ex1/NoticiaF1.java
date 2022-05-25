package tasca1n3ex1;

public class NoticiaF1 extends Noticia implements InterfaceNoticia {
private String escuderia;

	public NoticiaF1(String titular, String escuderia) {
	super(titular);
	this.escuderia = escuderia;
}
	

	public String getEscuderia() {
		return escuderia;
	}


	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
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
