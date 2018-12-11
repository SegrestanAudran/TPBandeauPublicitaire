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
    private int delaie;
    
    public EnNoirEtBlanc(String message,int delaie){
        this.message =message;
        this.delaie=delaie;
    }

    public EnNoirEtBlanc() {
    }
    
    
    
    public void affichesur(Bandeau B1){
        B1.setBackground(Color.black);
        B1.setForeground(Color.white);
        B1.setMessage(message);
        B1.sleep(delaie);
    }
}
