package Mission;

import java.util.Date;
import java.util.TreeMap;

public class MissionPreparation extends Mission {
	
	
	public MissionPreparation(int totalPersonne,
                                Date dateDebut,
                                int duree,
                                int id){
                this.id = id;
		this.competNbPersonne = new TreeMap<String, Integer>();
		this.totalPersonne = totalPersonne;
		this.dateDebut = dateDebut;
		this.duree = duree;
	}

	

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
        
        public String toString(){
            return this.id+";"+this.dateDebut+";"+this.duree+";"+this.totalPersonne+";";
        }
}
