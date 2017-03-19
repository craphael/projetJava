package Mission;

import java.util.Date;
import java.util.HashMap;

public class MissionEnCours  extends Mission {
	private HashMap<String, Integer> comptNbPersonne;
	private int totalPersonne;
	private Date dateDebut;
	private int duree;
	
	public MissionEnCours(int totalPersonne, Date dateDebut, int duree){
		this.comptNbPersonne = new HashMap<String, Integer>();
		this.totalPersonne = totalPersonne;
		this.dateDebut = dateDebut;
		this.duree = duree;
	}

	public Integer getComptNbPersonne(String i) {
		return comptNbPersonne.get(i);
	}

	public void setComptNbPersonne(String i, int nb) {
		this.comptNbPersonne.put(i, new Integer(nb)) ;
	}

	public int getTotalPersonne() {
		return totalPersonne;
	}

	public void setTotalPersonne(int totalPersonne) {
		this.totalPersonne = totalPersonne;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
}
