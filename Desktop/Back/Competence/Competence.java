/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Competence;
import Competence.Competence;
import com.opencsv.CSVReader;
import java.io.FileReader;

public class Competence {
        private CSVReader readerCompetences;
	private String id;
	private String libelleEn;
        private String libelleFr;
	
	public Competence(String id, String libelleEn, String libelleFr){
		this.id=id;
		this.libelleEn=libelleEn;
                this.libelleFr=libelleFr;
	}
        
        public String getLibelleFr() {
		return libelleFr;
	}

	public void setLibelleFr(String libelle) {
		this.libelleFr = libelle;
	}
	
	public String getLibelleEn() {
		return libelleEn;
	}

	public void setLibelleEn(String libelle) {
		this.libelleEn = libelle;
	}
	
	public String getId(){
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
        
	public String toString(){
		String str = "id : "+this.id+" -- ";
		str += "libelle : "+this.getLibelleEn();
		return str;
	}
        
        public String toStringCsv(){
		return this.getId()+";"+this.getLibelleEn()+";"+this.getLibelleFr();
        }
}

