package exemple;

import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;

public class MonBandeau {

    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scenario scenario = new Scenario(monBandeau);
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();


        scenario.addEffet(new Clignote(monBandeau,4 ));
        scenario.addEffet(new ChangementsCouleurPolice(monBandeau, 2));
        scenario.addEffet(new Tourner(monBandeau, 2));

        scenario.afficherScenario();
    }
}


/*
      package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;

public class Main2 {

	public static void main(String[] args) {
		Bandeau Bandeau = new Bandeau();
		TourComplet tc = new TourComplet();
		Clignotant ct = new Clignotant();
		DefilerCouleur dc = new DefilerCouleur();

		Font font = Bandeau.getFont();
		Color back = Bandeau.getBackground();
        Color fore = Bandeau.getForeground();

		//tc.executer(Bandeau);
		//ct.executer(Bandeau);
        //dc.executer(Bandeau);

        Scenario sc = new Scenario();
        sc.ajouterEffet(ct,50);
        sc.executer();


	}

}
	  }*/
