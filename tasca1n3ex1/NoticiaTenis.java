package tasca1n3ex1;

public class NoticiaTenis extends Noticia implements InterfaceNoticia {
private String competicio;
private String tenistes;


	public NoticiaTenis(String titular, String competicio, String tenistes) {
	super(titular);
	this.competicio = competicio;
	this.tenistes = tenistes;
}
	

	public String getCompeticio() {
		return competicio;
	}


	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}


	public String getTenistes() {
		return tenistes;
	}


	public void setTenistes(String tenistes) {
		this.tenistes = tenistes;
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
