/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import Interfaces.interfaceGraphiqueAjoutePerso;
import Interfaces.InterfaceGraphiquePersonnel;

import Competence.Competence;

public class Personnel {
	private int id;
	private Date dateEntree;
	private String nom;
	private String prenom;
	private ArrayList<String> tabC;
	
	/**
	 * Construteur de la classe Personnel
	 * 
	 * @param id L'identifiant du personnel
	 * @param dateEntree La date d'entrée du personnel
	 * @param nom Le nom du personnel
	 * @param prenom Le prenom du personnel
	 */
	public Personnel(int id, String dateEntree, String nom, String prenom){
		this.id=id;
		this.dateEntree=this.dateFr(dateEntree);
		this.nom=nom;
		this.prenom=prenom;
		this.tabC = new ArrayList<String>();
	}
	
	
	/**
	 * Retourne l'identifiant du personnel
         * 
	 * @return id Identifiant du personnel
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retourne la date d'entrèe dans l'entreprise du personnel
         * 
	 * @return La date d'entrée dans l'entreprise du personnel
	 */
	public Date getDateEntree() {
		return dateEntree;
	}

	/**
	 * Mettre à jour la date d'entrer du personnel
         * 
	 * @param dateEntree La date d'entrée dans l'entreprise du personnel
	 */
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}


	/**
	 * Retourne le nom du personnel
         * 
	 * @return Le nom du personnel
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * Mettre à jour le nom du personnel
         * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * Retourne le prenom du personnel
         * 
	 * @return Le prenom du personnel
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * Mettre à jour le prenom du personnel
         * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * Retourne tous les identifiants des compétences que le personnel possede
	 * @return Tous les identifiants des compétences que le personnel possede
	 */
	public ArrayList<String> getTabC() {
		return tabC;
	}

	/**
	 * Retourne sous forme de chaine de caractère avec toutes ces caractéristiques du personnel
	 * @return chaine de caractère avec toutes ces caractéristiques du personnel
	 */
        
        @Override
	public String toString(){
		String str = "id: "+this.id+" -- ";
		str += "dateEntree: "+this.dateEntree+" -- ";
		str += "nom: "+this.nom+" -- ";
		str += "prenom: "+this.prenom+" -- ";
		for(int i = 0; i<tabC.size();i++){
			str+= tabC.get(i).toString();
		}
		return str;
	}
	
	/**
	 * Ajouter une compétence au personnel
	 * @param c L'identifiant de la compétence
	 */
	public void ajouterCompetence(String c){
		tabC.add(c);
	}
	
	public void supprimerCompetence(String c){
		try{
			tabC.remove(c);
		}catch(Exception e){
			
		}
	}
	
        public void ajouterPersonnel(String c){
            this.getId();
            tabC.add(c);
        }
        
        public void supprimerPersonnel(String c){
		try{
			tabC.remove(c);
		}catch(Exception e){
			
		}
	}
        
        public String toStringCsv(){
            return this.prenom+";"+this.nom+";"+this.toStringDateFr()+";"+this.id;
        }
        
        public Date dateFr(String dateFr){
            int jour = Integer.parseInt(""+dateFr.charAt(0)+dateFr.charAt(1));
            int mois = Integer.parseInt(""+dateFr.charAt(3)+dateFr.charAt(4));
            int année = Integer.parseInt(""+dateFr.charAt(6)+dateFr.charAt(7)+dateFr.charAt(8)+dateFr.charAt(9));
            return new Date(année-1900,mois,jour);
        }
    
        public String toStringDateFr(){
            return this.dateEntree.getDay()+"/"+this.dateEntree.getMonth()+"/"+this.dateEntree.getYear();
        }
}
