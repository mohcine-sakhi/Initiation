package exo;

import java.util.Scanner;

public class PairImpair {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print( "Entrez un nombre entier : " );
        int nb = scanner.nextInt();
        
        if(nb == 0) {
            System.out.println( "Le nombre est zéro (et il est pair)" );
        }else {
            if(nb > 0) {
                System.out.print("le nombre est positif"  );
                
            }else {
                System.out.print("le nombre est négatif"  );
               
            }
            
            if(nb % 2 == 0) {
                    System.out.println( " et pair" );
            }else {
                    System.out.println( " et impair" );
            }

        }
    }
}
