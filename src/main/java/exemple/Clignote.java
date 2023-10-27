package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class Clignote extends Effet {

    public Clignote(Bandeau monbandeau, int repetitions) {
        super(monbandeau, repetitions);
    }
    public void afficher() {
        monbandeau.setMessage("affichage");
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 0; i < this.repetitions; i++) {
                if (i % 2 == 0) {
                    this.monbandeau.setForeground(Color.white);
                    this.monbandeau.sleep(500);
                }
                if ((i % 2) != 0) {
                    this.monbandeau.setForeground(Color.blue);
                    //this.monbandeau.getBackground(Color.blue);
                    this.monbandeau.sleep(500);

                }
            }
        }
    }
}
