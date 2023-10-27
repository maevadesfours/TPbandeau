package exemple;
import java.awt.Color;
import java.awt.Font;

import bandeau.Bandeau;
import java.util.ArrayList;

public class Scenario {
    private Bandeau bandeau;
    ArrayList<Effet> lesEffets = new ArrayList <Effet>();

     public Scenario(Bandeau bandeau) {

         this.bandeau = bandeau;
    }
    public void addEffet(Effet lesEffets) {
         this.lesEffets.add(lesEffets);
    }
    public void afficherScenario() {
        for (Effet x : lesEffets) {
            x.afficher();
            bandeau.sleep(100);
        }
        bandeau.close();
    }

}
