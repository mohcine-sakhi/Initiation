package exo;

import java.util.Scanner;

public class Permutation {

    private static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        System.out.print( "Entrez x : " );
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print( "Entrez y : " );
        int y = scanner.nextInt();
        scanner.nextLine();

        System.out.println( "Avant permutation :" );
        System.out.println( "x : " + x );
        System.out.println( "y : " + y );

        System.out.println( "Apres permutation :" );
        int temp = x;
        x = y;
        y = temp;
        System.out.println( "x : " + x );
        System.out.println( "y : " + y );

    }

}
