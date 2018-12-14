/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.util.Random;
/**
 *
 * @author asegrest
 */
public class RandomRotation extends EFFET{
    private String message;
    private int delaie;
    private Random angle = new Random(360);
    private Random signe = new Random();
    private double angleactuel;
    
    public RandomRotation(String message,int delaie){
        this.message= message;
        this.delaie = delaie;
    }
    
    public void afficheSur(Bandeau b){
        b.setMessage(message);
        angleactuel=b.getRotation();
        if (signe.nextBoolean()){
	b.setRotation(angleactuel+angle.nextDouble()*360*Math.PI/900);
        }
        else{
        b.setRotation(angleactuel-angle.nextDouble()*360*Math.PI/900);    
        }
	
        b.sleep(delaie);
    }
}
