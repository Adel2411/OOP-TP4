package Exo3;

public class AppliTepertoire {
    public static void main(String[] args) {
        Abonne a1 = new Abonne("zouhir", "0541671366");
        Abonne a2 = new Abonne("adel", "0555277907");
        Abonne a3 = new Abonne("abdou", "0348275323");
        System.out.println("\n\n--------- TEST ABONNE ---------\n");
        System.out.println(a1 + "\n");
        System.out.println(a2 + "\n");
        System.out.println(a3);

        System.out.println("\n\n-------------- TEST REPERTOIRE -------------\n");

        Repertoire Rep = new Repertoire(3);
        Rep.addAbonne(a1);
        Rep.addAbonne(a2);
        Rep.addAbonne(a3);

        System.out.println("\nAVANT LE TRIE : \n");
        System.out.println("Abonne1 : \n" + Rep.getAbonne(0) + "\n\nAbonne2 : \n" + Rep.getAbonne(1) + "\n\nAbonne3 : \n" + Rep.getAbonne(2) );

        System.out.println("\n\n--------- TEST DU TRIE -------------\n");

        Rep.getAbonnesTries();
        System.out.println("\nAPRES LE TRIE : \n");
        System.out.println("Abonne1 : \n" + Rep.getAbonne(0) + "\n\nAbonne2 : \n" + Rep.getAbonne(1) + "\n\nAbonne3 : \n" + Rep.getAbonne(2) );


        System.out.println(Rep.getNumero("adel"));
    }
}
