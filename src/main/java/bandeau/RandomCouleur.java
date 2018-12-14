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
    
    

    public Color RandomC(){
        int High=255;
        int Low = 0;
        Random re = new Random(); 
        int p1 = re.nextInt(High - Low) + Low;
        int p2 = re.nextInt(High - Low) + Low;
        int p3 = re.nextInt(High - Low) + Low;
      
        Color randomColor = new Color(p1, p2, p3);
        return randomColor;
    }
    
    public void afficheSur(Bandeau B1){
        //appel à la méthode RandomC pour avoir une couleur aléatoire
        //Pour le fond
        B1.setBackground(this.RandomC());
        //Pour le message
        B1.setForeground(this.RandomC());
        B1.setMessage(message);
       // B1.setForeground(Color.black);
        B1.sleep(delaie);
       
        
       // B1.setMessage(message);
       
    }
}

