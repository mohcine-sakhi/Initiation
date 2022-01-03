package exos;

public class Eratosthene {
    public static void main(String[] args) {
        boolean[] premiers = new boolean[100];
        
        for(int i = 2; i < premiers.length; ++i) {
            premiers[i] = true;
        }
        
        for ( int i = 2; i < premiers.length - 1; ++i ) {
            if(premiers[i]) {
                for(int j = i+1; j < premiers.length; ++j) {
                    // on verifie tout d abord que l element n est pas deja barre
                    if(premiers[i] && j % i == 0) {
                        premiers[j] = false;
                    }
                }
            }
        }
        
        for ( int i = 0; i < premiers.length; ++i ) {
            if(premiers[i]) {
                System.out.print( i + " " );
            }
        }
    }

}
