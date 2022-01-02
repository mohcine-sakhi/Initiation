package quiz;

import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final int HEURE_DEBUT_TRANCHE = 7;
        final int HEURE_FIN_TRANCHE = 17;
        if(debut < 0 || debut > 24 || fin < 0 || fin > 24) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }else if(debut ==  fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }else if( debut > fin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }else {
            int nbHeuresPrix1 = 0;
            int nbHeuresPrix2 = 0;
            
            if(fin <= HEURE_DEBUT_TRANCHE) { // debut < 7
                nbHeuresPrix1 += fin - debut;
            }else if ( debut >= HEURE_FIN_TRANCHE) { //  fin > 17
                nbHeuresPrix1 += fin - debut;
            }else if ( debut >= HEURE_DEBUT_TRANCHE && fin < HEURE_FIN_TRANCHE) {
                nbHeuresPrix2 += fin - debut;
            }else if( debut < HEURE_DEBUT_TRANCHE && fin <= HEURE_FIN_TRANCHE) {
                nbHeuresPrix1 += HEURE_DEBUT_TRANCHE - debut;
                nbHeuresPrix2 += fin - HEURE_DEBUT_TRANCHE;
            }else if(debut < HEURE_DEBUT_TRANCHE && fin > HEURE_FIN_TRANCHE) {
                nbHeuresPrix1 += HEURE_DEBUT_TRANCHE - debut + fin - HEURE_FIN_TRANCHE;
                nbHeuresPrix2 += HEURE_FIN_TRANCHE - HEURE_DEBUT_TRANCHE;
            }else {
                nbHeuresPrix1 += fin - HEURE_FIN_TRANCHE;
                nbHeuresPrix2 += HEURE_FIN_TRANCHE - debut;
            }
            System.out.println("Vous avez loué votre vélo pendant");
            if(nbHeuresPrix1 > 0) {
                System.out.println( nbHeuresPrix1 + " heure(s) au tarif horaire de 1.0 franc(s)" );
                        }
            if(nbHeuresPrix2 > 0) {
                System.out.println( nbHeuresPrix2 + " heure(s) au tarif horaire de 2.0 franc(s)" );       
                        }
            
            
            double montantApayer = nbHeuresPrix1 + 2 * nbHeuresPrix2;
            System.out.print("Le montant total à payer est de " + montantApayer);
            System.out.println(" franc(s).");
        }
        
        
        


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
