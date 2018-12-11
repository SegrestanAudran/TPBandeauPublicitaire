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
    private double angleactuel;
    
    public Rotation(String message,int delaie,double angle){
        this.message= message;
        this.delaie = delaie;
        this.angle = angle;
    }
    
    public void afficheSur(Bandeau b){
        b.setMessage(message);
        angleactuel=b.getRotation();
        for (int i = 0; i <= 10; i++) {
			b.setRotation(angleactuel+angle*Math.PI*i/1800);
			b.sleep(100);
		}
        b.sleep(delaie);
    }
    
}
