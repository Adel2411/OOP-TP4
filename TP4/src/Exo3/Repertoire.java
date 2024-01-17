package Exo3;
import java.util.ArrayList;
import java.util.Collections;

public class Repertoire {
    private int AbonneNB;
    private ArrayList<Abonne> Abonnes = new ArrayList<Abonne>(AbonneNB);
    
    public Repertoire(int AbonneNB) {
        this.AbonneNB = AbonneNB;
    }

    //Ajouter un abonné au répertoire
    public boolean addAbonne(Abonne a){
        if (Abonnes.size() >= AbonneNB) {
            return false;
        }
        Abonnes.add(a);
        return true;   
    }

    public String getNumero(String name) {
        for (Abonne i : this.Abonnes) {
            if (i.getName() == name) {
                return i.getPhNumber();
            }
        }
        return "0";
    }

    public int getNAbonnes() {
        return this.Abonnes.size();
    }

    public Abonne getAbonne(int i) {
        return this.Abonnes.get(i);
    }

    public void getAbonnesTries() {
        Collections.sort(Abonnes, new AbonneComparator());
    }
}
    
