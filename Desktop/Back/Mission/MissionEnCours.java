
package Mission;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class MissionEnCours  extends Mission {
	private TreeMap<String, Integer> competNbPersonne;
	private int totalPersonne;
	private Date dateDebut;
	private int duree;
	private  ArrayList<String> tabPerso;
	
	public MissionEnCours(MissionPlanifiee mp){
                this.id = mp.id;
		this.competNbPersonne = mp.getComptNbPersonne();
		this.totalPersonne = mp.getTotalPersonne();
		this.dateDebut = mp.getDateDebut();
		this.duree = mp.getDuree();
		this.tabPerso = new ArrayList<String>();
	}

	public Integer getComptNbPersonne(String i) {
		return competNbPersonne.get(i);
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
	
	public ArrayList<String> getTabPerso() {
		return tabPerso;
	}
}
