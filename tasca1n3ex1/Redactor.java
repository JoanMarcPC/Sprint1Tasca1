package tasca1n3ex1;

import java.util.ArrayList;

public class Redactor {
	
private static int sou;
	
private String nom;
private final String Dni;

private ArrayList<Noticia> noticies= new ArrayList <Noticia>();
public Redactor(String nom, String dni) {
	super();
	this.nom = nom;
	this.Dni = dni;
}
public static int getSou() {
	return sou;
}
public static void setSou(int sou) {
	Redactor.sou = sou;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public ArrayList<Noticia> getNoticies() {
	return noticies;
}
public void setNoticies(ArrayList<Noticia> noticies) {
	this.noticies = noticies;
}
public String getDni() {
	return Dni;
}



}
