package exo;

import java.util.Scanner;

class MulMatMod {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();
        
        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double [][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
    }
    
    static int lireEntier(String message) {
            int n = 0;
            do {
                System.out.print(message);
                n = scanner.nextInt();
            } while (n < 1);
            return n;
    }
    
    public static double[][] lireMatrice(){
        System.out.println("Saisie d'une matrice :");
        
        int lignes = lireEntier("Donner le nombre de lignes de la matrice  : ");
        
        int colonnes = lireEntier("Donner le nombre de colonnes de la matrice  : ");
        
        double[][] matrice = new double[lignes][colonnes];
        System.out.println( "Donner les éléments de la matrice" );
        
        for(int i = 0; i < matrice.length; ++i) {
            for(int j = 0; j < matrice[i].length; ++j) {
                System.out.print( "M["+i+"]["+j+"] : " );
                matrice[i][j] = scanner.nextInt();
            }
        }
        
        return matrice;
    }
    
    public static double[][] multiplierMatrice(double[][] matrice1, double[][] matrice2){
        
        double[][] matriceProduit = new double[matrice1.length][matrice2[0].length];
        
        for(int i = 0; i < matrice1.length; ++i) {
            for(int j = 0; j < matrice2[i].length; ++j) {
                for(int k = 0; k < matrice2.length; ++k) {
                    matriceProduit[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }
        
        return matriceProduit;
    }
    
    public static void afficherMatrice(double[][] matrice) {
        for(double[] ligne : matrice) {
            for(double colonne : ligne) {
                System.out.print( colonne + " " );
            }
            System.out.println( "" );
        }
    }
}
