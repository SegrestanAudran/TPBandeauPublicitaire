/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
//Le noir et blanc
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author asegrest
 */
public class RandomCouleur extends EFFET{

    private String message;
    // private Bandeau Bandeau;
    private int delaie;
    
    public RandomCouleur(String message,int delaie){
        this.message =message;
        this.delaie=delaie;
    }

    
    
    public void afficheSur(Bandeau B1){
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        B1.setBackground(Color.black);
        B1.setForeground(randomColor);
        B1.setMessage(message);
       // B1.setForeground(Color.black);
        B1.sleep(delaie);
       
        
       // B1.setMessage(message);
       
    }
}

