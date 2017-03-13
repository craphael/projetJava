package Main;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.opencsv.*;

import Competence.Competence;
import Personnel.Personnel;

public class Main {

	public static void main(String[] args) throws IOException {

			
		// Récupérer tout le personnel dans une collection (identifiant, date d'arrivée dans l'entreprise, nom et prénom)
		 /*ArrayList<Personnel> tabP = new ArrayList<Personnel>();
		 CSVReader reader = new CSVReader(new FileReader("liste_personnel.csv"), ';');
	     String [] nextLine;
	     int i = 0;
	     while ((nextLine = reader.readNext()) != null) {
	        // nextLine[] is an array of values from the line
	    	if(i!=0 & nextLine[1]!=""){
	    		tabP.add(new Personnel(Integer.parseInt(nextLine[3]),new Date(nextLine[2]),nextLine[1],nextLine[0]));
	    	}
	    	i++;
	     }
	     for(int j = 0; j<tabP.size();j++){
	    	 System.out.println(tabP.get(j).toString());
	     }
	     

	     // Récupérer toutes les compétences dans une collection (identifiant et libellé)
	     ArrayList<Competence> tabC = new ArrayList<Competence>();
		 reader = new CSVReader(new FileReader("liste_competences.csv"), ';');
	     nextLine = new String[2];
	     while ((nextLine = reader.readNext()) != null) {
	        // nextLine[] is an array of values from the line
	    	tabC.add(new Competence(nextLine[0],nextLine[1]));
	     }
	     for(int j = 0; j<tabC.size();j++){
	    	 System.out.println(tabC.get(j).toString());
	     }*/
	     
	     
	     HashMap<String,Personnel> tabPP = new HashMap<String,Personnel>();
	     CSVReader reader = new CSVReader(new FileReader("liste_personnel.csv"), ';');
	     String [] nextLine2;
	     int i = 0;
	     while ((nextLine2 = reader.readNext()) != null) {
	        // nextLine[] is an array of values from the line
	    	if(i!=0 & nextLine2[1]!=""){
	    		tabPP.put(nextLine2[3],new Personnel(Integer.parseInt(nextLine2[3]),new Date(nextLine2[2]),nextLine2[1],nextLine2[0]));
	    	}
	    	i++;
	     }
	     for(int j = 1; j<tabPP.size();j++){
	    	 System.out.println(tabPP.get(j).toString());
	     }
	     
	}

}
