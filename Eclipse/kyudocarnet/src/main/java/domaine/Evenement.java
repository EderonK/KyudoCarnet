package domaine;

import java.util.ArrayList;
import java.util.Date;

enum TypeEvenement {Stage,Club,Perso}

public class Evenement
{
	private TypeEvenement type;
	private String nom;
	private Date dateDebut;
	private Date dateFin;
	private String lieu;
	private ArrayList <String> planActions;
	private ArrayList <String> pointsVigilance;
	
	public Evenement(TypeEvenement type,String nom, Date dateDebut, Date dateFin, String lieu, ArrayList<String> planActions,
			ArrayList<String> pointsVigilance)
	{
		super();
		this.setType(type);
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieu = lieu;
		this.planActions = planActions;
		this.pointsVigilance = pointsVigilance;
	}

	public TypeEvenement getType() {
		return type;
	}

	public void setType(TypeEvenement type) {
		this.type = type;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public ArrayList<String> getPlanActions() {
		return planActions;
	}

	public void setPlanActions(ArrayList<String> planActions) {
		this.planActions = planActions;
	}

	public ArrayList<String> getPointsVigilance() {
		return pointsVigilance;
	}

	public void setPointsVigilance(ArrayList<String> pointsVigilance) {
		this.pointsVigilance = pointsVigilance;
	}
	
}
