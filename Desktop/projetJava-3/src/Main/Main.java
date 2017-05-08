/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Interfaces.interfaceGraphiqueAccueil;

/**
 *
 * @author clementraphaell
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap; 

import com.opencsv.CSVReader;

import Competence.Competence;
import Entreprise.Entreprise;
import Personnel.Personnel;

public class Main {
	
    public static void main(String[] args) throws IOException {

            Entreprise f = new Entreprise();
		
            // Récupérer tout le personnel dans une collection (identifiant, date d'arrivée dans l'entreprise, nom et prénom)
	     /*HashMap<String,Personnel> tabPP = f.recupererPersonnel();
	     for(int j = 1; j<tabPP.size()+1;j++){
	    	 System.out.println(Entreprise.tPersonnels.get(""+j).toString());
	     }*/
	     

	     // Récupérer toutes les compétences dans une collection (identifiant et libellé)
	     /*HashMap<String,Competence> tabC = f.recupererCompetence();
	     for(int j = 0; j<tabC.size();j++){
	    	 System.out.println(tabC.get("B.1.").toString());
	     }*/
             
             f.sauvegarderPersonnel();
    }
	
}
