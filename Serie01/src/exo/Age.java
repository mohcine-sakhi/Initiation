package exo;
import java.util.Scanner;

public class Age {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        final int ANNEE_COURANTE = 2021;
        System.out.println( "Donnez votre age :" );
        int age = scanner.nextInt();
        int annee = ANNEE_COURANTE - age;
        System.out.println( "Votre annee de naissance est : " + annee );
        scanner.close();
    }

}
