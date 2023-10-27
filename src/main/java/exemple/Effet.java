package exemple;
import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public abstract class Effet {
    public Bandeau monbandeau;
    protected int repetitions;


    public Effet(Bandeau monbandeau, int repetitions) {
        this.monbandeau = monbandeau;
        this.repetitions = repetitions;
    }


    public abstract void afficher();

}