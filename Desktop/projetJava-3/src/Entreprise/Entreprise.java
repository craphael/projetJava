/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entreprise;

import Competence.Competence;
import Mission.Mission;
import Mission.MissionPlanification;
import Personnel.Personnel;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Jérémy
 */
public class Entreprise {
    
    public static TreeMap<Integer,Personnel> tPersonnels;
    public static TreeMap<String,Competence> tCompetences;
    public static TreeMap<Integer,Mission> tMission;
    public static Integer idPersonnel;
    
    public Entreprise() throws IOException {
        this.tPersonnels = this.recupererPersonnel();
        this.tCompetences = this.recupererCompetence();
        //this.tMission = this.recupererMission();
    }
    /**
     * Récupère tout le personnel présent dans le csv et lui associe toutes ces comptétences
     * 
     * @return tabP HashMap<String,Personnel>
     * @throws NumberFormatException
     * @throws IOException
     */
    public TreeMap<Integer,Personnel>  recupererPersonnel() throws NumberFormatException, IOException{
            TreeMap<Integer,Personnel> tabP = new TreeMap<Integer,Personnel>();
            try {
                //Recupérer tout le personnel dans le fichier csv liste_personnel.csv
                CSVReader readerPersonnels = new CSVReader(new FileReader("liste_personnel.csv"), ';');

                String [] nextLine;
                int i = 0;
                while ((nextLine = readerPersonnels.readNext()) != null) {
                   // nextLine[] is an array of values from the line
                   if(i!=0){
                            tabP.put(Integer.valueOf(nextLine[3]), new Personnel(Integer.parseInt(nextLine[3]),nextLine[2],nextLine[1],nextLine[0]));
                   }
                   i++;
                }

                //Recuperer toutes les compétences de chaque personne
                CSVReader readerCompetPersonnels = new CSVReader(new FileReader("competences_personnel.csv"), ';');

                String [] nextLine2;
                i = 0;
                while ((nextLine2 = readerCompetPersonnels.readNext()) != null) {
                    // nextLine[] is an array of values from the line
                    if(i!=0){
                        Personnel p = tabP.get(Integer.valueOf(nextLine2[0]));
                        for(int j = 1; j<nextLine2.length ;j++){
                            p.ajouterCompetence(nextLine2[j]);
                        }
                    }
                    i++;
                }
            this.idPersonnel = new Integer((int)tabP.lastKey() + 1);
            return tabP;
            } catch (FileNotFoundException e) {
                     return null;
            }
    }

    public TreeMap<String,Competence>  recupererCompetence() throws NumberFormatException, IOException{
            TreeMap<String,Competence> tabC = new TreeMap<String,Competence>();
            try {
                CSVReader readerCompetences = new CSVReader(new FileReader("liste_competences.csv"), ';');
                 String [] nextLine;
                 int i = 0;
                 while ((nextLine = readerCompetences.readNext()) != null) {
                    // nextLine[] is an array of values from the line
                    if(i!=0 & nextLine[1]!=""){
                            tabC.put(nextLine[0],new Competence(nextLine[0],nextLine[1],nextLine[2]));
                    }
                    i++;
                 }
             return tabC;
            } catch (Exception e) {
                     System.out.println(e.toString());
                     return null;
            }
    }
    
    /*public TreeMap<Integer,Mission>  recupererMission() throws NumberFormatException, IOException{
            TreeMap<Integer,Mission> tabM = new TreeMap<Integer,Mission>();
            try {
                CSVReader reader = new CSVReader(new FileReader("mission_preparation.csv"), ';');
                 String [] nextLine;
                 int i = 0;
                 while ((nextLine = reader.readNext()) != null) {
                     
                    // nextLine[] is an array of values from the line
                    if(i!=0){
                            tabM.put(Integer.parseInt(nextLine[0]), new MissionPlanification(Integer.parseInt(nextLine[3]),
                                                                        dateFr(nextLine[1]),
                                                                        Integer.parseInt(nextLine[2]),
                                                                        Integer.parseInt(nextLine[0])
                                                                        ));
                    }
                    i++;
                 }
             return tabM;
            } catch (Exception e) {
                     System.out.println(e.toString());
                     return null;
            }
    }*/
    
    public void sauvegarderPersonnel() throws IOException{
        CSVWriter writer = new CSVWriter(new FileWriter("liste_personnel.csv"), ';' , CSVWriter.NO_QUOTE_CHARACTER);
        String  [] entries = "Prenom;Nom;date entrée entreprise;identifiant;".split(";");
        
        CSVWriter writer2 = new CSVWriter(new FileWriter("competences_personnel.csv"), ';' , CSVWriter.NO_QUOTE_CHARACTER);
        String  [] entries2 = "Employe;Liste Competences;".split(";");
        
        writer.writeNext(entries);
        writer2.writeNext(entries2);
        
        
        Set<Integer> keys = this.tPersonnels.keySet();
        for(Integer key: keys){
            Personnel p = this.tPersonnels.get(key);
            entries = p.toStringCsv().split(";");
            writer.writeNext(entries);
            
            ArrayList<String> tabC = p.getTabC();
            
            String competenceP = p.getId()+";";
            for (String c : tabC) {
                competenceP += c+";";
            }
            entries2 = competenceP.split(";");
            writer2.writeNext(entries2);
        }
	writer.close ();
        writer2.close();
    }
    
    public void sauvegarderCompetence() throws IOException{
        CSVWriter writer = new CSVWriter(new FileWriter("test.csv"), ';' , CSVWriter.NO_QUOTE_CHARACTER);
        String  [] entries;
        Iterator i = this.tCompetences.keySet().iterator();
        String clef = null;
        Competence valeur = null;
        while (i.hasNext())
        {
            clef = (String)i.next();
            valeur = this.tCompetences.get(clef);
            entries = valeur.toStringCsv().split(";");
            writer.writeNext(entries);
        }
	writer.close ();
    }
    
    public boolean ajoutPersonnel(String dateEntree, String nom, String prenom){
        if (dateEntree == null || dateEntree.equals("") || nom == null || nom.equals("") || prenom == null || prenom.equals("") ) {
            return false;
        }
        Personnel p = new Personnel(this.idPersonnel,dateEntree, nom, prenom);
        this.tPersonnels.put(idPersonnel, p);
        return true;
    }
    
    public boolean ajoutCompétence(String id, String libelleEn, String libelleFr){
        if(id == null || id.equals("") || libelleEn.equals("") || libelleEn == null || libelleFr == null || libelleFr.equals("") ){
            return false;
        }
        Competence c = new Competence(id,libelleEn, libelleFr);
        this.tCompetences.put(id, c);
        return true;
    }
    
    public Date dateFr(String dateFr){
        int jour = Integer.parseInt(""+dateFr.charAt(0)+dateFr.charAt(1));
        int mois = Integer.parseInt(""+dateFr.charAt(3)+dateFr.charAt(4));
        int année = Integer.parseInt(""+dateFr.charAt(6)+dateFr.charAt(7)+dateFr.charAt(8)+dateFr.charAt(9));
        return new Date(année-1900,mois,jour,0,0);
    }
    
    public String toStringDateFr(Date date){
        return date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
    }
}