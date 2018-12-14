package bandeau;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asegrest
 */
public class Pendu extends EFFET {
    private String message;
    private boolean s;
    private Integer i;
    private List<String> a =  new LinkedList<>();
    private List<String> c = new LinkedList<>();
    private List<Integer> ordre = new LinkedList<>();
    private Random random = new Random();
    public Pendu(String message){
        this.message = message;
    }
    
    public void afficheSur(Bandeau b){
        for(char p: message.toCharArray()){
            a.add(Character.toString(p));
            c.add("_");
        }
        s=false;
        while(s==false){
            i =random.nextInt(message.length());
            if(ordre.contains(i)){
           
        }
            else{
                ordre.add(i);
            }
        if(ordre.size()== message.length()){
            s=true;
        }
        String o = new String();
        for (String t:c){
            o+=t;
        }
        b.setMessage(o);
        for(Integer r:ordre){
            c.set(r, a.get(r));
            o = new String();
            for (String t:c){
                o+=t;
            }
        b.setMessage(o);
        b.sleep(100);
        }
        }
        
        
    }
    
}
