package Personnel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import Competence.Competence;

public class Personnel {
	private int id;
	private Date dateEntree;
	private String nom;
	private String prenom;
	private ArrayList<String> tabC;
	
	/**
	 * 
	 * Construteur de la classe Personnel
	 * 
	 * @param id L'identifiant du personnel
	 * @param dateEntree La date d'entr�e du personnel
	 * @param nom Le nom du personnel
	 * @param prenom Le prenom du personnel
	 */
	public Personnel(int id, Date dateEntree, String nom, String prenom){
		this.id=id;
		this.dateEntree=dateEntree;
		this.nom=nom;
		this.prenom=prenom;
		this.tabC = new ArrayList<String>();
	}
	
	
	/**
	 * Retourne l'identifiant du personnel
	 * @return id Identifiant du personnel
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retourne la date d'entr�e dans l'entreprise du personnel
	 * @return La date d'entr�e dans l'entreprise du personnel
	 */
	public Date getDateEntree() {
		return dateEntree;
	}


	/**
	 * Mettre � jour la date d'entrer du personnel
	 * @param dateEntree La date d'entr�e dans l'entreprise du personnel
	 */
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}


	/**
	 * Retourne le nom du personnel
	 * @return Le nom du personnel
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * Mettre � jour le nom du personnel
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * Retourne le prenom du personnel
	 * @return Le prenom du personnel
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * Mettre � jour le prenom du personnel
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * Retourne tous les identifiants des comp�tences que le personnel possede
	 * @return Tous les identifiants des comp�tences que le personnel possede
	 */
	public ArrayList<String> getTabC() {
		return tabC;
	}

	/**
	 * Retourne sous forme de chaine de caract�re avec toutes ces caract�ristiques du personnel
	 * @return chaine de caract�re avec toutes ces caract�ristiques du personnel
	 */
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
	 * Ajouter une comp�tence au personnel
	 * @param c L'identifiant de la comp�tence
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
	
}
