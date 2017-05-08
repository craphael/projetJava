/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

public class MessageDor {
    
    //Propriétés
    private int id;
    private String pseudo;
    private String message;
    
    
    //Constructeur
    
    public MessageDor(){}
    
    public MessageDor(String pseudo, String message) {
        this.pseudo = pseudo;
        this.message = message;
    }
    
    // Setter/Getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
