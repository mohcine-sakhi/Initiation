package jeu;

public class Jeu {
    
    public final static int VIDE = 0;
    public final static int ROUGE = 1;
    public final static int VERT = 2;
    public final static int LIGNE = 6;
    public final static int COLONNE = 7; 
    
    public static void main(String[] args) {
        
        int[][] grille = new int[LIGNE][COLONNE];
            
        initialise( grille );
        affiche( grille );
        
        for ( int i = 0; i < 10; i++ ) {
            boolean valide = joue( grille, 2, ROUGE );
            
            if(valide) {
                affiche(grille);
            }else {
                System.out.println( "Impossible d'ajouter un pion dans cette colonne !" );
            }
        }
      
    }
    
    public static void initialise(int[][] grille) {
        for(int i = 0; i < grille.length; ++i) {
            for(int j = 0; j < grille[i].length; ++j) {
                grille[i][j] = VIDE;
            }
        }
    }
    
    // affiche X pour une case Rouge et O pour une case Verte
    public static void affiche(int[][] grille) {
        for(int i = 0; i < grille.length; ++i) {
            System.out.print( " |" );
            for(int j = 0; j < grille[i].length; ++j) {
                if(grille[i][j] == VIDE) {
                    System.out.print( " " );
                }else if(grille[i][j] == ROUGE) {
                    System.out.print( "X" );
                }else {
                    System.out.print( "O" );
                }
                System.out.print( "|" );
            }
            System.out.println( " " );
        }
        
        
        System.out.print( "=" );
        for(int i = 1; i <= grille[0].length; ++i) {
            System.out.print( "=" + i );
        }
        System.out.println( "==" );
        
    }
    
    public static Boolean joue(int[][] grille, int colonne, int couleur) {
        // la colonne est pleine
        if(grille[0][colonne] != VIDE) {
            return false;
        }else {
            // on cherche la ligne vide à partie du bas
            int ligne = grille.length - 1;
            while(grille[ligne][colonne] != VIDE) {
                --ligne;
            }
            
            //ajout du coup^
            grille[ligne][colonne] = couleur;
            return true;
        }
    }

}
