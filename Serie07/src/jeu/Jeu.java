package jeu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jeu {
    
    public final static int VIDE = 0;
    public final static int ROUGE = 1;
    public final static int VERT = 2;
    public final static int LIGNE = 6;
    public final static int COLONNE = 7; 
    public final static int NOMBRE_PIONS_ALIGNES = 4;
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int[][] grille = new int[LIGNE][COLONNE];
        
        int couleurJoueur = ROUGE;
        int colonne; 
        boolean gagne;
            
        initialise( grille );
        affiche( grille );
       
       do {
    	   colonne = demandeEtJoue(grille, couleurJoueur);
    	   
    	   affiche(grille);
    	   
    	   gagne = estCeGagne(grille, colonne, couleurJoueur);
    	  
    	   couleurJoueur = alterneJoueur(couleurJoueur);
    	   
       }while(! gagne) ;
        
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
        // la colonne sup est pleine
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
    
    public static int demandeEtJoue(int[][] grille, int CouleurJoueur) {
    	boolean valide;
    	int colonne = 0;
    	do {
    		System.out.print("Joueur ");
    		
    		if(CouleurJoueur == ROUGE) {
        		System.out.print("X");
        	}else {
        		System.out.print("O");
        	}
    		
    		System.out.println(" : Dans quelle colonne vous voulez jouer ? ");
        	try {
        		colonne = scanner.nextInt();
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
    	
    	return colonne;
    }
    
    public static int alterneJoueur(int couleurJoueur) {
    	if(couleurJoueur == ROUGE) {
    		return VERT;
    	}
    	return ROUGE;
    }
    
    
    public static boolean compte(int[][] grille, int colonne, int CouleurJoueur) {
    	// on recupere la position du dernier coup
    	// on cherche la ligne vide à partie du bas
        int ligne = grille.length - 1;
        // ligne >= 0 pour ne pas deborder sur le tableau
        while(ligne >= 0 && grille[ligne][colonne] != VIDE) {
            --ligne;
        }
        int x = ++ligne;
        int y = colonne;
        int compte = 1;
       
        //on compte vers le bas, on part de la case adjascente
        while(x < grille.length - 1 && grille[++x][y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
        	++compte;
        }
       
        if(compte == NOMBRE_PIONS_ALIGNES) {
        	return true;
        }
        
        //on compte horizontalement
         x = ligne;
         y = colonne;
         compte = 1;
         //vers la droite, on part de la case adjascente
         while(y < grille[0].length - 1 && grille[x][++y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
         	++compte;
         }
         //vers la gauche, on part de la case adjascente
         y = colonne;
         while(y > 0 && grille[x][--y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
          	++compte;
          }
         
         if(compte == NOMBRE_PIONS_ALIGNES) {
         	return true;
         }
         
       //on compte diagonalement
         x = ligne;
         y = colonne;
         compte = 1;
         // vers le haut et vers la  droite 
         while(x > 0 && y < grille[0].length - 1 && grille[--x][++y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
          	++compte;
          }
          
          x = ligne;
          y = colonne;
          //vers le bas et vers la gauche 
          while(x < grille.length - 1 && y > 0 && grille[++x][--y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
           	++compte;
           }
         
          if(compte == NOMBRE_PIONS_ALIGNES) {
          	return true;
          }
          
          
          //on compte diagonalement
            x = ligne;
            y = colonne;
            compte = 1;
            // vers le haut et vers la  gauche
            while(x > 0 && y > 0  && grille[--x][--y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
             	++compte;
             }
             
             x = ligne;
             y = colonne;
             //vers le bas et  vers la droite  
             while(x < grille.length - 1 && y < grille[0].length - 1 
            		 && grille[++x][++y] == CouleurJoueur && compte < NOMBRE_PIONS_ALIGNES) {
              	++compte;
              }
             
             if(compte == NOMBRE_PIONS_ALIGNES) {
             	return true;
             }
         
    	return false;
    }
    
    // on va verifier si la ligne sup contient une case vide
    public static boolean estCeGagne(int[][] grille, int colonne, int CouleurJoueur) {
    	boolean estCeGagne = compte(grille, colonne, CouleurJoueur);
    	if(estCeGagne) {
    		System.out.print("Joueur ");
    		
    		if(CouleurJoueur == ROUGE) {
        		System.out.print("X");
        	}else {
        		System.out.print("O");
        	}
    		
    		System.out.println(" a gagné. Bravoooooooooooo !");
    		return true;
    	}
    	int j = 0;
    	while(j < grille[0].length) {
    		if(grille[0][j] == VIDE) {
    			return false;
    		}
    		++j;
    	}
    	System.out.println("Jeu terminé. Match nul !");
    	return true;
    }

}
