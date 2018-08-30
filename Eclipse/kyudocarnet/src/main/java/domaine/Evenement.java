package domaine;

import java.util.ArrayList;
import java.util.Date;

public class Evenement
{
	private String nom;
	private Date dateDebut;
	private Date dateFin;
	private String lieu;
	private ArrayList <String> planActions;
	private ArrayList <String> pointsVigilance;
	
	public Evenement(String nom, Date dateDebut, Date dateFin, String lieu, ArrayList<String> planActions,
			ArrayList<String> pointsVigilance)
	{
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieu = lieu;
		this.planActions = planActions;
		this.pointsVigilance = pointsVigilance;
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
