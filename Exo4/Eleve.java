package Exo4;

import java.util.Scanner;

public class Eleve {
    private String name;
    private Mention mention;

    public Eleve(String name) {
        this.name = name;
        this.mention = setMention();
    }

    public Mention setMention() {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3;
        System.out.print("Entrez votre note de mathématiques : ");
        n1 = input.nextDouble();
        System.out.print("Entrez votre note de français : ");
        n2 = input.nextDouble();
        System.out.print("Entrez votre note d'anglais : ");
        n3 = input.nextDouble();
        double Moy = (n1 + n2 + n3) / 3;
        System.out.println("la moyenne de " + this.name + " est : " + Moy);
        input.close();
        if (Moy < 10) {
            return Mention.N;
        } else if (Moy < 12) {
            return Mention.P;
        } else if (Moy < 14) {
            return Mention.AB;
        } else if (Moy < 16) {
            return Mention.B;
        } else {
            return Mention.TB;
        }
        
    }

    @Override
    public String toString() {
        return "Eleve{ nom = " + this.name + ", mention = " + this.mention.MentionMessage() + "}";
    }
}


/*
- Moyenne <10 : non admis
- 10<=moyenne < 12 : Passable
- 12<=moyenne< 14 : Assez bien
- 14 <=moyenne< 16 : Bien
- 16<= moyenne : Très bien
*/