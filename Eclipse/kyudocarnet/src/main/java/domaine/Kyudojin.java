package domaine;

import java.util.ArrayList;

public class Kyudojin
{
	private String club;
	private String nom;
	private String prenom;
	private String grade;
	
	private ArrayList <Evenement> listeEvenements;
	
	public Kyudojin(String club, String nom, String prenom, String grade, ArrayList <Evenement> listeEvenements)
	{
		super();
		this.club = club;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.setListeEvenements(listeEvenements);
	}
	
	public Kyudojin(String club, String nom, String prenom, String grade)
	{
		this(club, nom, prenom, grade, new ArrayList <Evenement>());
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ArrayList <Evenement> getListeEvenements() {
		return listeEvenements;
	}

	public void setListeEvenements(ArrayList <Evenement> listeEvenements) {
		this.listeEvenements = listeEvenements;
	}
	
	
}
