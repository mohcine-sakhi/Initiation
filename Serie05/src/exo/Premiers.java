package exo;

import java.util.ArrayList;

public class Premiers {
    
    public static void main(String[] args) {
        ArrayList<Integer> premiers = new ArrayList<Integer>();
        
        premiers.add( 2 );
        for(int i = 3; i < 100; ++i) {
            if(i % 2 != 0) {
                int racine = (int) Math.sqrt( i );
                boolean premier = true;
                for(int j = 3; j < racine && premier; j += 2) {
                    if(i % j == 0) {
                        premier = false;
                    }
                }
                if(premier) {
                    premiers.add( i );
                }
            }
        }
        
        System.out.println( "Les nombres premiers compris entre 2 et 100 sont les suivants : " );
        for ( Integer val : premiers ) {
            System.out.print( val + " " );
        }
    }

}
