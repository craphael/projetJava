package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.opencsv.CSVReader;

import Competence.Competence;
import Personnel.Personnel;

public class File {
	
	private CSVReader readerPersonnels;
	private CSVReader readerCompetences;
	private CSVReader readerCompetPersonnels;
	
	
	/**
	 * 
	 * 
	 * 
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public HashMap<String,Personnel>  recupererPersonnel() throws NumberFormatException, IOException{
		HashMap<String,Personnel> tabP = new HashMap<String,Personnel>();
		try {
			 //Recupérer tout le personnel dans le fichier csv liste_personnel.csv
			 readerPersonnels = new CSVReader(new FileReader("liste_personnel.csv"), ';');
		
		     String [] nextLine;
		     int i = 0;
		     while ((nextLine = readerPersonnels.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		    	if(i!=0){
		    		tabP.put(nextLine[3],new Personnel(Integer.parseInt(nextLine[3]),new Date(nextLine[2]),nextLine[1],nextLine[0]));
		    	}
		    	i++;
		     }
		     
		     //Recuperer toutes les compétences de chaque personne
		     readerCompetPersonnels = new CSVReader(new FileReader("competences_personnel.csv"), ';');
		     
		     String [] nextLine2;
		     i = 0;
		     while ((nextLine2 = readerCompetPersonnels.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		    	if(i!=0){
		    		Personnel p = tabP.get(nextLine2[0]);
		    		for(int j = 1; j<nextLine2.length;j++){
		    			p.ajouterCompetence(nextLine2[j]);
		    		}
		    	}
		    	i++;
		     }
		     
	     	 return tabP;
		} catch (FileNotFoundException e) {
			 return null;
		}
	}
	
	public HashMap<String,Competence>  recupererCompetence() throws NumberFormatException, IOException{
		HashMap<String,Competence> tabC = new HashMap<String,Competence>();
		try {
			readerCompetences = new CSVReader(new FileReader("liste_competences.csv"), ';');
		     String [] nextLine;
		     int i = 0;
		     while ((nextLine = readerCompetences.readNext()) != null) {
		        // nextLine[] is an array of values from the line
		    	if(i!=0 & nextLine[1]!=""){
		    		tabC.put(nextLine[0],new Competence(nextLine[0],nextLine[1]));
		    	}
		    	i++;
		     }
	     	 return tabC;
		} catch (Exception e) {
			 System.out.println(e.toString());
			 return null;
		}
	}
}
