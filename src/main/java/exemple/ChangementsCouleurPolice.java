package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ChangementsCouleurPolice extends Effet{

    public ChangementsCouleurPolice(Bandeau monbandeau, int repetitions) {
        super(monbandeau, repetitions);
    }

    public void afficher() {
        monbandeau.setMessage("Changement police et couleur");
        monbandeau.sleep(500);
        monbandeau.setMessage("Changement police et couleur");
        monbandeau.setFont(new Font("Monospaced",Font.BOLD, 15));
        monbandeau.setForeground(Color.PINK);
        monbandeau.sleep(500);
        monbandeau.setMessage("Changement police et couleur");
        monbandeau.setFont(new Font("Dialog",Font.BOLD, 50));
        monbandeau.setForeground(Color.YELLOW);
        monbandeau.sleep(500);
        monbandeau.setMessage("Changement police et couleur");
        monbandeau.setFont(new Font("SansSerif", Font.PLAIN, 35));
        monbandeau.setForeground(Color.GREEN);
        monbandeau.sleep(500);
        monbandeau.setMessage("Changement police et couleur");
        monbandeau.sleep(500);
        monbandeau.setFont(new Font("Arial", Font.BOLD, 60));
        monbandeau.setForeground(Color.BLUE);


            // monbandeau.setForeground(Color.HSBtoRGB(0.5,0.5,0.5));
}
}
