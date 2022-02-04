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
        grille[2][3] = ROUGE;
        grille[3][5] = ROUGE;
        grille[4][1] = VERT;
        grille[3][3] = VERT;
        
        affiche( grille );
        
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

}
