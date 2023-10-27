package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public abstract class Effet {
    public Bandeau monbandeau;
    protected int repetitions;
   // protected String affichage;
    protected Color couleur;

    public Effet(Bandeau monbandeau, int repetitions) {
        this.monbandeau = monbandeau;
        this.repetitions = repetitions;
    }

   /* public Effet( Bandeau bandeau, String message,Color couleur) {
        this.monbandeau = monbandeau;
        this.affichage = affichage;
        this.couleur = couleur;
    }*/

    public abstract void afficher();

}