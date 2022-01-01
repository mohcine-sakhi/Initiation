package exo;
import java.util.Scanner;

public class Fondue {
    private static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        final int BASE = 4;
        double fromage = 800.0;
        double eau = 2.0;
        double ail = 2.0;
        double pain = 400.0;

        System.out.print( "Entrez le nombre de personne(s) conviées à la fondue :  " );
        int nbConvives = scanner.nextInt();

        double ratio = nbConvives;
        ratio /= BASE;

        fromage *= ratio;
        eau *= ratio;
        ail *= ratio;
        pain *= ratio;

        System.out.println( "Pour faire une fondue fribourgeoise pour " + nbConvives + " personne(s), il vous faut :" );
        System.out.println( " - " + fromage + " gr de Vacherin fribourgeois" );
        System.out.println( " - " + eau + " dl d'eau" );
        System.out.println( " - " + ail + " gousse(s) d'ail" );
        System.out.println( " - " + pain + " gr de pain" );
        System.out.println( " - du poivre à volonté" );

    }
}
