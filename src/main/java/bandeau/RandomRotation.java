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
    private double angleactuel;
    
    public RandomRotation(String message,int delaie){
        this.message= message;
        this.delaie = delaie;
    }
    
    public void afficheSur(Bandeau b){
        b.setMessage(message);
        angleactuel=b.getRotation();
        //for (int i = 0; i <= 10; i++) {
			b.setRotation(angleactuel+angle.nextDouble()*360*Math.PI/1800);
		//	b.sleep(100);
		//}
        b.sleep(delaie);
    }
}
