package exo;

import java.util.Locale;
import java.util.Scanner;

public class Degre3 {

    private static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        scanner.useLocale( Locale.ENGLISH );
        System.out.print( "Entrer a (int) : " );
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print( "Entrer b (int) : " );
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print( "Entrer c (int) : " );
        int c = scanner.nextInt();
        scanner.nextLine();
        System.out.print( "Entrer x (double) : " );
        double x = scanner.nextDouble();
        scanner.nextLine();

        double resultat = ( ( a + b ) / 2.0 ) * x * x * x;
        resultat += ( a + b ) * ( a + b ) * x * x;
        resultat += a + b + c;

        System.out.println( "La valeur du polynôme est : " + resultat );
    }

}
