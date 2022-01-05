package exo;

import java.util.Scanner;

public class Recouvrement {
    public static final int DIM = 10;
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean[][] grille = new boolean[DIM][DIM];
        int ligne; 
        int colonne; 
        char direction;
        int longueur;
        String reponse;
        do {
            System.out.print( "Entrez coord. x : " );
            ligne = scanner.nextInt();
            scanner.nextLine();
            if(ligne < 0 ) {
                afficherGrille( grille );
                break;
            }
            System.out.print( "Entrez coord. y : " );
            colonne = scanner.nextInt();
            scanner.nextLine();
            
            if(colonne < 0 ) {
                afficherGrille( grille );
                break;
            }
            
            System.out.print( "Entrez direction (N,S,E,O) : " );
            direction = scanner.nextLine().charAt( 0 );
            System.out.print( "Entrez taille : " );
            longueur = scanner.nextInt();
            reponse = "Placement en (" + ligne + "," + colonne +") direction " + direction + " longueur " + longueur + " -> ";
            if(remplitGrille( grille, ligne, colonne, direction, longueur )) {
                reponse += "succès";
            }else {
                reponse += "ECHEC";
            }
            System.out.println( reponse );
            
            if(ligne < 0 || colonne < 0) {
                afficherGrille( grille );
            }

        }while(ligne >= 0 && colonne >= 0);
        
      
    }
    public static boolean remplitGrille(boolean[][] grille, int ligne, int colonne, char direction, int longueur) {
        
        if(ligne >= grille.length || ligne < 0 || colonne >= grille[0].length ||  colonne < 0 || longueur > grille.length || longueur < 0
          || !(direction == 'N' || direction == 'S' || direction == 'E' || direction == 'O') ) {
            return false;
        }
        
        switch(direction) {
        
            case 'N' :{
                        int i = ligne;
                        int recouvrement = 0;
                        while(i >= 0 && recouvrement < longueur && ! grille[i][colonne]) {
                            --i;
                            ++recouvrement;
                        }
                        if(recouvrement == longueur) {
                            for ( int k = 0; k < longueur  ; ++k ) {
                                grille[ligne - k][colonne] = true;
                            }
                        }else {
                            return false;
                        }
                       }
                       break;
                       
            case 'S' : {
                        int i = ligne;
                        int recouvrement = 0;
                        while(i < grille.length && recouvrement < longueur &&  ! grille[i][colonne]) {
                            ++i;
                            ++recouvrement;
                        }
                        if(recouvrement == longueur) {
                            for ( int k = 0; k < longueur  ; ++k ) {
                                grille[ligne - k][colonne] = true;
                            }
                        }else {
                            return false;
                        }
                       }
                       break;
                       
            case 'E' : {
                        int j = colonne;
                        int recouvrement = 0;
                        while(j < grille[ligne].length && recouvrement < longueur && ! grille[ligne][j]) {
                            ++j;
                            ++recouvrement;
                        }
                        if(recouvrement == longueur) {
                            for ( int k = 0; k < longueur  ; ++k ) {
                                grille[ligne][colonne + k] = true;
                            }
                        }else {
                            return false;
                        }
                       } 
                       break;
                       
            case 'O' : {
                        int j = colonne;
                        int recouvrement = 0;
                        while(j >= 0 && recouvrement < longueur && ! grille[ligne][j]) {
                            --j;
                            ++recouvrement;
                        }
                        if(recouvrement == longueur) {
                            for ( int k = 0; k < longueur  ; ++k ) {
                                grille[ligne][colonne - k] = true;
                            }
                        }else {
                            return false;
                        }
                       }
                       break;
        }
        return true;
    }
    
    public static void afficherGrille(boolean[][] grille) {
        System.out.println( "  0 1 2 3 4 5 6 7 8 9" );
        int i = 0;
        for ( boolean[] ligne : grille ) {
            System.out.print( i + " " );
            ++i;
            for ( boolean colonne : ligne ) {
                if(colonne) {
                    System.out.print( "# " );
                }else {
                    System.out.print( ". " );
                }
            }
            System.out.println( "" );
        }
    }

}
