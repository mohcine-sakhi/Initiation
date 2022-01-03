package exos;

import java.util.Scanner;

public class elementsEnIndice {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] elements = {4, 2, 8, 0, 7, 1, 2, 9};
        int tailleMax = 0;
        if(elements.length >= 2) {
            tailleMax  = elements[1];
             for(int i = 1; i < elements.length;  i += 2 ) {
                 if(elements[i] > tailleMax) {
                     tailleMax = elements[i];
                 }
             }
        }
        
        int[] elementsEnIndice = new int[tailleMax + 1];
        
        for(int i = 0; i < elements.length;  i += 2 ) {
            elementsEnIndice[elements[i + 1]] = elements[i];
            
        }
        
      for ( int i : elementsEnIndice ) {
          System.out.print( i + " " );
    }
        
    }

}
