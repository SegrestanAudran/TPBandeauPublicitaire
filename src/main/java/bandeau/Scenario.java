/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.util.*;
/**
 *
 * @author asegrest
 */
public class Scenario{
   
    public List<EFFET> listeEffet = new LinkedList<>();
    
    
    public void addeffet(EFFET e,int repetition){
        for (int i = 0; i < repetition; i++) {
            listeEffet.add(e);
        }
        
    }
    
    public void afficheSur(Bandeau monBandeau){
        for(EFFET e:listeEffet){
            e.affichesur(monBandeau);
        }
    }
    
}
