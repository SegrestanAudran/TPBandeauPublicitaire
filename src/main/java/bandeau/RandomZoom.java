/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

/**
 *
 * @author asegrest
 */
public class RandomZoom extends EFFET{
    public Random random = new Random();
    public String message;
    public int delaie;
    
    public RandomZoom(String message,int delaie){
        this.message = message;
        this.delaie = delaie;
    }
    
    
    public void afficheSur(Bandeau b){
    b.setFont(new Font("Dialog", Font.BOLD, 5));
    b.setMessage(message);
    b.setForeground(Color.black);
    b.setBackground(Color.white);
    
   //for (int i = 5; i < random.nextInt(100) ; i+=5) {
//	b.setFont(new Font("Dialog", Font.BOLD, 5+i));
//	b.sleep(10);
 // }
    b.setFont(new Font("Dialog", Font.BOLD,random.nextInt(100) ));
    b.sleep(delaie);
    
    }
}
