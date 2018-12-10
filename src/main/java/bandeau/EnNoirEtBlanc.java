/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
//Le noir et blanc
import java.awt.Color;

/**
 *
 * @author asegrest
 */
public class EnNoirEtBlanc extends EFFET{
    private String message;
    private Bandeau Bandeau;
    public EnNoirEtBlanc(String message){
        this.message =message;
    }
    
    public void changementCouleur(){
        Bandeau.setBackground(Color.black);
        Bandeau.setForeground(Color.white);
        Bandeau.setMessage(message);
    }
    
    public void affichesur(){
        
    }
}
