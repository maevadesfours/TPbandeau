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

