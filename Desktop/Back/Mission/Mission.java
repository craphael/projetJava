/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mission;

import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author clementraphaell
 */
public abstract class Mission {
    protected int id;
    protected TreeMap<String, Integer> competNbPersonne;
    protected int totalPersonne;
    protected Date dateDebut;
    protected int duree;
    
    public Integer getComptNbPersonne(String i) {
        return competNbPersonne.get(i);
    }

    public TreeMap<String, Integer> getComptNbPersonne() {
        return competNbPersonne;
    }
    
    public int getTotalPersonne() {
        return totalPersonne;
    }

    
    
    public Date getDateDebut() {
        return dateDebut;
    }
}
