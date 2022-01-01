package exo;

import java.util.Scanner;

public class RoseBlanches {

    private static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {

        System.out.print( "Combien avez-vous reçu d'argent (Frs) ? " );
        int sommeRecue = scanner.nextInt();
        int livreEtFournitures = sommeRecue * 3 / 4;
        sommeRecue -= livreEtFournitures;

        int reste = sommeRecue / 3;
        int roses = sommeRecue % 3;

        int cafe = reste / 2;
        roses += reste % 2;

        int flashInformatique = reste / 4;
        roses += reste % 4;

        int billetMetro = reste / 3;
        roses += reste % 3;

        System.out.println( "Livre et Fournitures : " + livreEtFournitures + " Frs" );
        System.out.println( "Vous pouvez ensuite acheter :" );
        System.out.println( " " + cafe + " cafés" );
        System.out.println( " " + flashInformatique + " numéros de Flash Informatique" );
        System.out.println( " " + billetMetro + " billets de métro" );
        System.out.println( "et il vous restera " + roses + " Frs pour les roses blanches." );

    }

}
