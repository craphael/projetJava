package Competence;

public class Competence {
	private String id;
	private String libelle;
	
	public Competence(String id, String libelle){
		this.id=id;
		this.libelle=libelle;
	}
	
	public String toString(){
		String str = "id : "+this.id+" -- ";
		str += "libelle : "+this.libelle;
		return str;
	}
}
