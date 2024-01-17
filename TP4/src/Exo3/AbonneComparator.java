package Exo3;

import java.util.Comparator;

public class AbonneComparator implements Comparator<Abonne> {
    
    @Override
    public int compare(Abonne a1, Abonne a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
