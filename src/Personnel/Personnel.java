package Personnel;

import java.util.Date;

public class Personnel {
	private int id;
	private Date dateEntree;
	private String nom;
	private String prenom;
	
	public Personnel(int id, Date dateEntree, String nom, String prenom){
		this.id=id;
		this.dateEntree=dateEntree;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public String toString(){
		String str = "id: "+this.id+" -- ";
		str += "dateEntree: "+this.dateEntree+" -- ";
		str += "nom: "+this.nom+" -- ";
		str += "prenom: "+this.prenom+" ";
		return str;
	}
}
