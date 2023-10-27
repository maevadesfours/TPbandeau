package exemple;
import bandeau.Bandeau;

import java.awt.*;

public class Tourner extends Effet {

        public Tourner(Bandeau bandeau, int repetitions) {
            super( bandeau, repetitions);
        }

        public void afficher() {
            monbandeau.setMessage("ça tourne !!!");
            for (int n = 0; n < this.repetitions; n++) {
                for (int i = 0; i <= 100; i++) {
                    this.monbandeau.setForeground(Color.black);
                    this.monbandeau.setFont(new Font("New roman",Font.BOLD, 20));
                    this.monbandeau.setRotation(2 * Math.PI * i / 100);
                    this.monbandeau.sleep(50);
                }
            }

        }
    }

