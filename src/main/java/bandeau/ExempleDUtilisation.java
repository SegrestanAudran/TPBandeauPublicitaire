package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private final Bandeau monBandeau = new Bandeau();
    private Scenario test = new Scenario();
    
    public static void main(String[] args) {
	    new ExempleDUtilisation().exemple();
    }
    
    public void exemple() {
        EnNoirEtBlanc effet = new EnNoirEtBlanc("Coucou c'est moi",1000);
        Rotation effet1 = new Rotation("Coucou je tourne !",1000,90);
        test.addeffet(effet, 1);
        test.addeffet(effet1, 4);
        test.afficheSur(monBandeau);
       /* Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va changer de police");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Monospaced 15 Bold");
		monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("SansSerif 15");
		monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
		monBandeau.sleep(1000);
		monBandeau.setMessage("On va zoomer");
		monBandeau.sleep(1000);
		monBandeau.setMessage("Zoom........");
		for (int i = 5; i < 60 ; i+=5) {
			monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			monBandeau.sleep(100);
		}
		monBandeau.sleep(1000);

		monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
		monBandeau.setMessage("On va tourner");
		monBandeau.sleep(1000);
		monBandeau.setMessage("On tourne...");
		for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(2*Math.PI*i / 100);
			monBandeau.sleep(100);
		}

		monBandeau.setMessage("On va changer de couleur de fond");
		monBandeau.sleep(1000);
		monBandeau.setBackground(Color.DARK_GRAY);
		monBandeau.setMessage("On va changer de couleur");
		monBandeau.sleep(1000);
		monBandeau.setForeground(Color.YELLOW);
		monBandeau.sleep(1000);
		monBandeau.setFont(font);
		monBandeau.setForeground(fore);
		monBandeau.setBackground(back);
		monBandeau.setMessage("Termine");
		//System.exit(0);
  */ }
}
