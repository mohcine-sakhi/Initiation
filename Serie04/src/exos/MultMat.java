package exos;

import java.util.Scanner;

public class MultMat {
        private static Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {
            int[][] matrice1;
            int[][] matrice2;
            int[][] matriceProduit;
            
            System.out.print( "Donner le nombre de lignes de la matrice 1 : " );
            int lignes1 = scanner.nextInt();
            System.out.print( "Donner le nombre de colonnes de la matrice 1 : " );
            int colonnes1 = scanner.nextInt();
            System.out.print( "Donner le nombre de lignes de la matrice 2 : " );
            int lignes2 = scanner.nextInt();
            System.out.print( "Donner le nombre de colonnes de la matrice 2 : " );
            int colonnes2 = scanner.nextInt();
            
            if(colonnes1 != lignes2) {
                System.out.println( "Multiplication de matrices impossible !" );
            }else {
                 matrice1 = new int[lignes1][colonnes1];
                 matrice2 = new int[lignes2][colonnes2];
                 matriceProduit = new int[lignes1][colonnes2];
                 
                 System.out.println( "Donner les éléments de la 1 matrice" );
                 
                 for(int i = 0; i < matrice1.length; ++i) {
                     for(int j = 0; j < matrice1[i].length; ++j) {
                         System.out.print( "M["+i+"]["+j+"] : " );
                         matrice1[i][j] = scanner.nextInt();
                     }
                 }
                 
                 System.out.println( "Donner les éléments de la 2 matrice" );
                 
                 for(int i = 0; i < matrice2.length; ++i) {
                     for(int j = 0; j < matrice2[i].length; ++j) {
                         System.out.print( "M["+i+"]["+j+"] : " );
                         matrice2[i][j] = scanner.nextInt();
                     }
                 }
                 
                 System.out.println( "la matrice produit est : " );
                 
                 for(int i = 0; i < matrice1.length; ++i) {
                     for(int j = 0; j < matrice2[i].length; ++j) {
                         for(int k = 0; k < matrice2.length; ++k) {
                             matriceProduit[i][j] += matrice1[i][k] * matrice2[k][j];
                         }
                     }
                 }
                 
                 for(int[] ligne : matriceProduit) {
                     for(int colonne : ligne) {
                         System.out.print( colonne + " " );
                     }
                     System.out.println( "" );
                 }
            }
            
        }
}
