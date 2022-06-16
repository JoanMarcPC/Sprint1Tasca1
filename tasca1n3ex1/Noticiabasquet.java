package tasca1n3ex1;

public class Noticiabasquet extends Noticia implements InterfaceNoticia{
private String competicio;
private String club;

public Noticiabasquet(String titular, String competicio, String club) {
	super(titular);
	this.competicio = competicio;
	this.club = club;
}

public String getCompeticio() {
	return competicio;
}

public void setCompeticio(String competicio) {
	this.competicio = competicio;
}

public String getClub() {
	return club;
}

public void setClub(String club) {
	this.club = club;
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
