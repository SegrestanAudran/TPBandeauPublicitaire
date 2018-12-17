/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author Yasmina
 */
public class ExempleScenario {
    private final Bandeau monBandeau = new Bandeau();
    private Scenario Scenario = new Scenario();
    
    public static void main(String[] args) {
	    new ExempleScenario().exemple();
    }
    
    public void exemple() {
        EnNoirEtBlanc effet = new EnNoirEtBlanc("Coucou c'est moi",1000);
        Clignoter effet2 = new Clignoter("Coucou je suis sensé clignoter",1000);
        RandomCouleur effet3 = new RandomCouleur("Coucou je me change",1000);
        Rotation effet1 = new Rotation("Coucou je tourne !",1000,90);
        RemisAZero effet6 = new RemisAZero("On se met bien !",1000);
        RandomRotation effet5 = new RandomRotation("Coucou je tourne !",100);
        RandomZoom effet4 = new RandomZoom("Zooom, Zoom, Zoom");
        Pendu effet8 = new Pendu("Coucou je suis pendu");
        Scenario.addeffet(effet, 1);
        Scenario.addeffet(effet1, 1);
        Scenario.addeffet(effet5, 1);
        Scenario.addeffet(effet6, 1);
        Scenario.addeffet(effet1, 1);
        Scenario.addeffet(effet6, 1);
        Scenario.addeffet(effet3,4 );
        Scenario.addeffet(effet1, 1);
        Scenario.addeffet(effet2, 4);
        Scenario.addeffet(effet6, 1);
        Scenario.addeffet(effet8,1);
        Scenario.afficheSur(monBandeau);
        System.exit(10);
    }
}
