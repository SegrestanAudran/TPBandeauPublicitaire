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
public class RemisAZero extends EFFET{
    private String message;
    private int delaie;
    
    public RemisAZero(String message,int delaie){
        this.message =message;
        this.delaie=delaie;
    }
    
    public void afficheSur(Bandeau B1){
         B1.setBackground(Color.white);
         B1.setForeground(Color.black);
        B1.setRotation(0);
        B1.setMessage(message);
        B1.sleep(delaie);
    }
}
