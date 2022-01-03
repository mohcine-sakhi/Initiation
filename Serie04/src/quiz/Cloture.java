package quiz;
import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme Ã  partir d'ici.
         *******************************************/
        for ( int i = 0; i < carte.length; i++ ) {
            for ( int j = 0; j < carte[i].length; j++ ) {
                if(! (carte[i][j] == 0 || carte[i][j] == 1)) {
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '" + carte[i][j]);
                    System.out.print("' trouvée en position [");
                    System.out.print(i + "][" + j);
                    System.out.println("]");
                    return;
                }
            }   
        }
        
        //Affichage du tableau
//        System.out.println( "=================================" );
//        for ( int i = 0; i < carte.length; i++ ) {
//            for ( int j = 0; j < carte[i].length; j++ ) {  
//                     System.out.print( carte[i][j] );; 
//            }
//            System.out.println(  );
//        }
        
        //Trouver les zones de 0 ( les composantes connexes) 
        ArrayList<Integer> ordonnees = new ArrayList<>();
        ArrayList<Integer> abscisses = new ArrayList<>();
        int composante = 1;
        for ( int i = 0; i < carte.length; i++ ) {
            for ( int j = 0; j < carte[i].length; j++ ) {
                if( carte[i][j] == 0 ) {
                    ++composante;
                    ordonnees.add( i );
                    abscisses.add( j );
                    while(!ordonnees.isEmpty() && !abscisses.isEmpty()) {
                        int ord = ordonnees.get( 0 );
                        int abs = abscisses.get( 0 );
             
                        ordonnees.remove( 0 );
                        abscisses.remove( 0 );
                        if(carte[ord][abs] == 0) {
                            carte[ord][abs] = composante;
                            //Recuper les voisins qui ont la val 0 et les ajouter aux tableaux dynamiques
                            
                            //Voisin Nord
                            if( (ord-1) >= 0 && carte[ord-1][abs] == 0) {
                                ordonnees.add( ord-1 );
                                abscisses.add( abs );
                            }
                            //Voisin Sud
                            if( (ord+1) < carte.length && carte[ord+1][abs] == 0) {
                                ordonnees.add( ord+1 );
                                abscisses.add( abs );
                            }
                            //Voisin Ouest
                            if( (abs-1) > 0 && carte[ord][abs-1] == 0) {
                                ordonnees.add( ord );
                                abscisses.add( abs-1 );
                            }
                            //Voisin Est
                            if( (abs+1) < carte[ord].length && carte[ord][abs+1] == 0) {
                                ordonnees.add( ord );
                                abscisses.add( abs+1 );
                            }
                        }
                                           
                    }
                }
            }  
            
        }
       
        
        //Trouver les zones de 0 exterieures
        ArrayList<Integer> zerosExternes = new ArrayList<>();
        for ( int i = 0; i < carte.length; i++ ) {
            for ( int j = 0; j < carte[i].length; j++ ) {
                if( (i == 0 || i == carte.length -1 || j == 0 || j == carte[i].length -1)
                        && carte[i][j] != 1 && !zerosExternes.contains( carte[i][j])) {
                    zerosExternes.add( carte[i][j] );
                }
            }
        }
        
      
        //effacer les etangs a l'interieur du terrain et verifier la convexite en ligne
        int positionFirstOne = 0;
        int positionLastOne = 0;
        boolean firstOne;
        for ( int i = 0; i < carte.length; i++ ) {
             firstOne = false;
            for ( int j = 0; j < carte[i].length; j++ ) {
                if(! firstOne && carte[i][j] == 1  ) {
                    positionFirstOne = j;
                    firstOne = true;
                }
                if( carte[i][j] == 1 ) {
                    positionLastOne = j;
                }
            }
            
            for ( int k = positionFirstOne; k < positionLastOne; k++ ) {
                if(zerosExternes.contains( carte[i][k])) {
                    System.out.println("Votre carte du terrain n'a pas le bon format :");
                    System.out.print("bord extérieur entrant trouvé en position [");
                    System.out.print(i + "][" + k);
                    System.out.println("]");
                    return;
                }
                    carte[i][k] = 1; 
            }
        }
        
        int cloture = 0;
        for ( int i = 0; i < carte.length; i++ ) {
            for ( int j = 0; j < carte[i].length; j++ ) {
                if(carte[i][j] == 1) {
                    if( (i-1) < 0 || carte[i-1][j] != 1) {
                        ++cloture;
                    }
                    if( (i+1) >= carte.length || carte[i+1][j] != 1) {
                        ++cloture;
                    }
                    if( (j-1) < 0 ||carte[i][j-1] != 1) {
                        ++cloture;
                    }
                    if( (j+1) >= carte[i].length || carte[i][j+1] != 1) {
                        ++cloture;
                    }
                    
                }
            }
        }

        System.out.print("Il vous faut " + (cloture * 2.5) );
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier aprÃ¨s cette ligne.
         *******************************************/
    }
}