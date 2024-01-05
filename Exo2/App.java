package Exo2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String verb, termine, radical;
        Scanner input = new Scanner(System.in);

        System.out.print("Donnez un verbe regulier du premier groupe: ");
        verb = input.next();
        termine = verb.substring(verb.length()-2, verb.length());
        boolean bool = (!termine.equals("er") && !termine.equals("ER")) ? false : true;

        while (!bool) {
            System.out.println("Le verbe que vous avez entrer n'est pas du premier groupe");
            System.out.print("Veuillez entrez un nouveau verbe: ");
            verb = input.next();
            termine = verb.substring(verb.length()-2, verb.length());
            if (termine.equals("er") || termine.equals("ER")) {
                bool = true;
            }
        }

        radical = verb.substring(0, verb.length() - 2);
        System.out.println("\nLA CONJUGAISON DU VERBE (" + verb + ") EST LA SUIVANTE :");
        System.out.println("je\t" + radical + "e");
        System.out.println("tu\t" + radical + "es");
        System.out.println("il/elle\t" + radical + "e");
        System.out.println("nous\t" + radical + "ons");
        System.out.println("vous\t" + radical + "ez");
        System.out.println("ils/elles\t" + radical + "ent");

        input.close();
    }
}
