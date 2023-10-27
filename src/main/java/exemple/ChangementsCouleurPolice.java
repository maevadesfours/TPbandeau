package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class ChangementsCouleurPolice extends Effet{

    public ChangementsCouleurPolice(Bandeau monbandeau, int repetitions) {
        super(monbandeau, repetitions);
    }

    public void afficher() {
        for (int n = 0; n < this.repetitions; n++) {

            monbandeau.setForeground(Color.BLUE);
            monbandeau.setFont(new Font("Calibri",Font.BOLD, 25));
            monbandeau.setMessage("Changement police et couleur");
            monbandeau.sleep(800);
            monbandeau.setMessage("Changement police et couleur");
            monbandeau.setFont(new Font("Calibri",Font.PLAIN, 15));
            monbandeau.setForeground(Color.YELLOW);
            monbandeau.sleep(800);
            monbandeau.setMessage("Changement police et couleur");
            monbandeau.setFont(new Font("Dialog",Font.BOLD, 25));
            monbandeau.setForeground(Color.RED);
            monbandeau.sleep(800);
            monbandeau.setMessage("Changement police et couleur");
            monbandeau.setFont(new Font("SansSerif", Font.PLAIN, 10));
            monbandeau.setForeground(Color.GREEN);
            monbandeau.sleep(800);
            monbandeau.setMessage("Changement police et couleur");
            monbandeau.sleep(800);
            monbandeau.setFont(new Font("Arial", Font.BOLD, 25));
            monbandeau.setForeground(Color.ORANGE);


}
}
}
