/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.MessageDor;


public class bd {
    
    private static final String URL="jdbc:mysql://localhost:3306/db_21613852";
    private static final String LOGIN="21613852";
    private static final String PASSWORD="37807A";
    private static Connection cx=null;
     
    public static void connexion() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        cx = DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }
    
    public static int enregistrer(MessageDor msg) throws SQLException{
        PreparedStatement st;
        
        if (bd.cx == null) {
            try {
                bd.connexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //requete SQL
        String sql="insert into Message(Pseudo,Message) values (?,?)";
        
        //creation de l'espace de requête précompilé
        st = cx.prepareStatement(sql);
        
        //Insertions des valeurs
        st.setString(1,msg.getPseudo());
        st.setString(2,msg.getMessage());
        
        //Exécuter la requête;
        int nb = st.executeUpdate();
        st.close();
        return nb;
        
    }
    
    public static void update(String id, String pseudo, String texte) throws SQLException {
        PreparedStatement st;

        //requete SQl
        String sql = "Update Message set Pseudo='"+pseudo+"', Message='"+texte+"' where idMessage=" +id + ";";
        //Création de l'espace de requete
        st = cx.prepareStatement(sql);

        //exécution de la requète
        int nb = st.executeUpdate(sql);

        //fermeture de l'espace de requête 
        st.close();
    }
    
    public static ArrayList<MessageDor> lireMessage() throws SQLException{
        try {
            bd.connexion();
        } catch (ClassNotFoundException ex) {
            System.out.println("Problème chargement pilote - "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Problème lors de la connexion - "+ex.getMessage());
        }
        ArrayList <MessageDor> list=new ArrayList<MessageDor>();
        
        PreparedStatement st;
        String sql ="select * from Message";
      
        st = cx.prepareStatement(sql);
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next())
            {
                String p=rs.getString("Pseudo");
                String msg=rs.getString("Message");
                int id=rs.getInt("idMessage");
                MessageDor m=new MessageDor(p,msg);
                m.setId(id);
                list.add(m);
            }
        
       return list;
    }
    
    public static String getMessage(String id) throws SQLException, ClassNotFoundException {

        connexion();

        PreparedStatement st;
        String sql = "Select * from Message where NumMsg=" + id;
        st = cx.prepareStatement(sql);

        ResultSet rs = st.executeQuery();
        String res = "";
        while (rs.next()) {
            res = rs.getString("Pseudo") + " " + rs.getString("Texte");
        }

        return res;

    }
    
    public static void main(String[] a) throws SQLException {
        try {
            bd.connexion();
        } catch (ClassNotFoundException ex) {
            System.out.println("Problème chargement pilote - "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Problème lors de la connexion - "+ex.getMessage());
        }
        
        
        ArrayList<MessageDor> list=lireMessage();
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i).getPseudo());
            System.out.println(": "+list.get(i).getMessage());
        }
        
    }

    public static void effacerMessage(int id) throws SQLException {
       if(cx==null){
           try{
               connexion();
           }catch(ClassNotFoundException ex){
           Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       PreparedStatement state;
       String sql="Delete from Message where idMessage=?";
       state=cx.prepareStatement(sql);
       state.setInt(1, id);
       int nb=state.executeUpdate();
       state.close();
    }
    
    public static MessageDor getMessageDor(String id) throws SQLException, ClassNotFoundException {

        if(cx==null){
           try{
               connexion();
           }catch(ClassNotFoundException ex){
           Logger.getLogger(bd.class.getName()).log(Level.SEVERE, null, ex);
           }
       }

        PreparedStatement st;
        String sql = "Select * from Message where idMessage=" + id;
        st = cx.prepareStatement(sql);

        ResultSet rs = st.executeQuery(sql);
        MessageDor msg = null;
        while (rs.next()) {
            msg = new MessageDor(rs.getString("Pseudo"), rs.getString("Message"));
            msg.setId(Integer.parseInt(rs.getString("idMessage")));
        }

        return msg;

    }
    
}
