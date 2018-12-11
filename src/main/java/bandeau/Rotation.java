/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author asegrest
 */
public class Rotation extends EFFET{
    private String message;
    private int delaie;
    private double angle;
    
    public Rotation(String message,int delaie,double angle){
        this.message= message;
        this.delaie = delaie;
        this.angle = angle;
    }
    
    public void afficheSur(Bandeau b){
        b.setMessage(message);
        for (int i = 0; i <= 100; i++) {
			b.setRotation(angle*2*Math.PI*i / 100*360);
			b.sleep(100);
		}
        b.sleep(delaie);
    }
    
}
