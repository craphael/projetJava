/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mission;

import java.util.Date;

/**
 *
 * @author jerem
 */
public abstract class MissionModifiable extends Mission {
    
    public void addComptNbPersonne(String s, Integer i){
        if(s!=null && s.equals("") && i!=null ){
            this.competNbPersonne.put(s,i);
        }
    }
    
    public void setTotalPersonne(int totalPersonne) {
        this.totalPersonne = totalPersonne;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
}
