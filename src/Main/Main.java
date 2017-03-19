package Main;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.opencsv.*;

import Competence.Competence;
import File.File;
import Personnel.Personnel;

public class Main {

	public static void main(String[] args) throws IOException {

		File f = new File();
		
		// Récupérer tout le personnel dans une collection (identifiant, date d'arrivée dans l'entreprise, nom et prénom)
	     HashMap<String,Personnel> tabPP = f.recupererPersonnel();
	     for(int j = 1; j<tabPP.size();j++){
	    	 System.out.println(tabPP.get(""+j).toString());
	     }
	     

	     // Récupérer toutes les compétences dans une collection (identifiant et libellé)
	     /*HashMap<String,Competence> tabC = f.recupererCompetence();
	     for(int j = 0; j<tabC.size();j++){
	    	 System.out.println(tabC.get(""+j).toString());
	     }*/
	     
	    
	     
	}

}
