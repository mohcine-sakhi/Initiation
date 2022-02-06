package jeu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jeu {
    
    public final static int VIDE = 0;
    public final static int ROUGE = 1;
    public final static int VERT = 2;
    public final static int LIGNE = 6;
    public final static int COLONNE = 7; 
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[][] grille = new int[LIGNE][COLONNE];
            
        initialise( grille );
        affiche( grille );
       
       int couleurJoueur = ROUGE;
       
       do {
    	   demandeEtJoue(grille, couleurJoueur);
    	   affiche(grille);
    	   couleurJoueur = alterneJoueur(couleurJoueur);
    	   
       }while(! estTermine(grille)) ;
        
      System.out.println("Le jeu est terminé");
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
        if(colonne < 0 || colonne >= grille[0].length || grille[0][colonne] != VIDE) {
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
    
    public static void demandeEtJoue(int[][] grille, int CouleurJoueur) {
    	boolean valide;
    	do {
    		System.out.print("Joueur ");
    		
    		if(CouleurJoueur == ROUGE) {
        		System.out.print("X");
        	}else {
        		System.out.print("O");
        	}
    		
    		System.out.println(" : Dans quelle colonne vous voulez jouer ? ");
        	try {
        		int colonne = scanner.nextInt();
          	    scanner.nextLine();
          	    
          	    valide = joue(grille, --colonne, CouleurJoueur);
          	    
          	    if(!valide) {
          	    	System.out.println(" > le coup n'est pas valide ");
          	    }
        	}catch(InputMismatchException e) {
        		System.out.println(" > le coup n'est pas valide ");
        		valide = false;
        		scanner.nextLine();
        	}
      	   	
    	}while(! valide);
    }
    
    public static int alterneJoueur(int couleurJoueur) {
    	if(couleurJoueur == ROUGE) {
    		return VERT;
    	}
    	return ROUGE;
    }
    
    // on va verifier si la ligne sup contient une case vide
    public static boolean estTermine(int[][] grille) {
    	int j = 0;
    	while(j < grille[0].length) {
    		if(grille[0][j] == VIDE) {
    			return false;
    		}
    		++j;
    	}
    	return true;
    }
    
    public static boolean gagne(int[][] grille) {
    	return false;
    }

}
