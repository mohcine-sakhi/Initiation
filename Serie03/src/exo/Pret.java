package exo;

import java.util.Locale;
import java.util.Scanner;

public class Pret {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String [] args) {
        
        int S0;
        int r;
        double ir;
        
        scanner.useLocale( Locale.ENGLISH );
        
        do {
            System.out.print( "Donner la somme de prêt : " );
            S0 = scanner.nextInt();
        }while(S0 <= 0);
        
        do {
            System.out.print( "Donner la mensualité : " );
            r = scanner.nextInt();
        }while(r <= 0);
        
        do {
            System.out.print( "Donner le taux : " );
            ir = scanner.nextDouble();
        }while(ir <= 0 || ir >=1);
        
        int nbMois = 0;
        double interets = 0;
        double sommeRestante = S0;
        
        
        while(sommeRestante > 0 ) {
            
            nbMois++ ;
            
            interets += ir * sommeRestante;
            
            sommeRestante -= r;
            
        }
        
        System.out.println( "La somme des intérêts encaissés (sur  " + nbMois + ") est alors de " + interets +" euros." );
    }

}
