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
public class Clignoter extends EFFET{
    private String message;
    // private Bandeau Bandeau;
    private int delaie;
    private Color backgroundColor;
    
    public Clignoter(String message,int delaie){
        this.message =message;
        this.delaie=delaie;
    }

    
    
    public void afficheSur(Bandeau B1){
        
       backgroundColor = B1.getBackground();
        B1.setBackground(backgroundColor);
        B1.setMessage(message);
        B1.setForeground(Color.black);
        B1.sleep(delaie/2);
        B1.setForeground(backgroundColor);
        B1.sleep(delaie/2);
        
       // B1.setMessage(message);
       
    }
}

