package exo;

import java.util.Locale;
import java.util.Scanner;

public class PGDC {
    
    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        scanner.useLocale( Locale.ENGLISH );
        System.out.print( "Entrer un nombre positif : " );
        int a = scanner.nextInt();
        System.out.print( "Entrer un nombre positif : " );
        int b = scanner.nextInt();
        
        int max, min;
        if(a >= b) {
            max = a;
            min = b;
        }else {
            max = b;
            min = a;
        }
        
        int reste = max % min;
        int pgdc = min;
        
        while( reste != 0) {
            max = min;
            min  = reste;
            reste = max % min;
            pgdc = min;
        }
        
        System.out.println( "Le plus grand diviseur commun de " + a +" et " + b +" est " + pgdc );
             
    }

}
