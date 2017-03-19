package Competence;

public class Competence {
	private String id;
	private String libelle;
	
	public Competence(String id, String libelle){
		this.id=id;
		this.libelle=libelle;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String getId(){
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString(){
		String str = "id : "+this.id+" -- ";
		str += "libelle : "+this.libelle;
		return str;
	}
}
