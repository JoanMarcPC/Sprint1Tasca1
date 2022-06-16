package tasca1n3ex1;

public class NoticiaFutbol extends Noticia implements InterfaceNoticia{
private String competicio;
private String club;
private String jugador;

	public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
	super(titular);
	this.competicio = competicio;
	this.club = club;
	this.jugador = jugador;
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

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public int calcularPreuNoticia() {
		// TODO Auto-generated method stub
		int preu = 300;
		if(this.competicio.equalsIgnoreCase("Lliga de campions")) {
			preu+=100;
		}
		if(this.club.equalsIgnoreCase("Barça")||this.club.equalsIgnoreCase("Madrid")) {
			preu+=100;
		}
		if(this.jugador.equalsIgnoreCase("Ferran Torres")||this.jugador.equalsIgnoreCase("Benzema")) {
			preu+=50;
		}
		super.setPreu(preu);
		return preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		// TODO Auto-generated method stub
		int puntuacio= 5;
		if(this.competicio.equalsIgnoreCase("Lliga de campions")) {
			puntuacio+=3;
		}else if(this.competicio.equalsIgnoreCase("Lliga")){
			puntuacio+=2;
		}
		if(this.club.equalsIgnoreCase("Barça")||this.club.equalsIgnoreCase("Madrid")) {
			puntuacio+=1;
		}
		if(this.jugador.equalsIgnoreCase("Ferran Torres")||this.jugador.equalsIgnoreCase("Benzema")) {
			puntuacio+=1;
		}
		super.setPuntuacio(puntuacio); 
		return puntuacio;
	}

}
