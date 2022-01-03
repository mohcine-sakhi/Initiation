package exos;

import java.util.Scanner;

public class Pascal {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print( "Donner la taille du triangle de Pascal : " );
        int taille = scanner.nextInt();
        
        int[][] pascal = new int[taille][];
        for(int i = 0; i < pascal.length; ++i) {
            pascal[i] = new int[i+1];
            pascal[i][0] = 1; 
            pascal[i][pascal[i].length -1] = 1;
            
            for(int j = 1; j < i ; ++j) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
            
        }
        
        for(int[] ligne : pascal) {
            for(int colonne : ligne) {
                System.out.print( colonne + " " );
            }
            System.out.println( "" );
        }
    }
}
