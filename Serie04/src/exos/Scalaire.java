package exos;

import java.util.Scanner;

public class Scalaire {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int nMax = 10;
        int n;
        do {
            System.out.print( "Donner la taille des vecteurs : " );
            n = scanner.nextInt();
        }while(n <= 0 | n > nMax);
        
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        
        System.out.println( "Donner les composants du 1 vecteur" );
        for(int i = 0; i < v1.length; ++i) {
            System.out.print( "v1" + (i+1) + " : " );
            v1[i] = scanner.nextInt();
        }
        
        System.out.println( "Donner les composants du 2 vecteur" );
        for(int i = 0; i < v2.length; ++i) {
            System.out.print( "v2" + (i+1) + " : " );
            v2[i] = scanner.nextInt();
        }
        
        int scalaire = 0;
        for(int i = 0; i < v2.length; ++i) {
            scalaire += v1[i] * v2[i];
        }
        
        System.out.println( "Le produit scalaire de v1 par v2 est : " + scalaire );
        
    }

}
