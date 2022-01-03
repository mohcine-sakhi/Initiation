package exo;

import java.util.Locale;
import java.util.Scanner;

public class Rebonds1 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        final double G = 9.81; 
        double h0;
        double eps;
        int nbRebonds;
        
        scanner.useLocale( Locale.ENGLISH );
        
        do {
            System.out.print( "Entrer une hauteur initiale positve : " );
            h0 = scanner.nextDouble();
        }while(h0 <= 0);
        
        do {
            System.out.print( "Entrer esp compris entre 0 et 1 : " );
            eps = scanner.nextDouble();
        }while(eps < 0 || eps >= 1);
        
        do {
            System.out.print( "Entrer le nombre de rebonds : " );
            nbRebonds = scanner.nextInt();
        }while(nbRebonds <= 0);
        
        
        double vitesseDArivee;
        double vitesseRebonds;
        double hauteurApresRebonds = h0;
        for(int i = 1; i <= nbRebonds; ++i) {
            vitesseDArivee = Math.sqrt( 2 * hauteurApresRebonds * G );
            vitesseRebonds = eps * vitesseDArivee;
            hauteurApresRebonds = Math.pow( vitesseRebonds, 2 ) / (2 * G);
            System.out.println("rebond " + i + " : " + hauteurApresRebonds);

        }
        
        System.out.println( "la hauteur à laquelle la balle remonte après un nombre "+ nbRebonds +" de rebonds est " + hauteurApresRebonds);
    }
}
