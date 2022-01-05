package exo;

import java.util.Scanner;

public class Fibonacci {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char reponse = ' ';
        do {
            
            int nb = demanderNombre( 0, 40 );
            scanner.nextLine();
            System.out.println( "Méthode itérative :" );
            System.out.println( "F(" + nb + ") = " + fibonacciIteratif( nb ) );
            System.out.println( "Méthode récursive :" );
            System.out.println( "F(" + nb + ") = " + fibonacci( nb ) );
            System.out.print( "Voulez-vous recommencer [o/n] ? " );
            reponse = scanner.nextLine().charAt( 0 );
            
        }while(reponse == 'o' || reponse == 'O');
        
    }
    
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    static int fibonacciIteratif(int n) {
        int Fn = 0; // stocke F(i) , initialisé par F(0)
        int Fn_1 = Fn; // stocke F(i-1), initialisé par F(0)
        int Fn_2 = 1; // stocke F(i-2), initialisé par F(-1)
        if (n > 0) {
            for (int i = 1; i <= n; ++i) {
                Fn = Fn_1 + Fn_2; // pour n>=1 on calcule F(n)=F(n-1)+F(n-2)
                Fn_2 = Fn_1; // et on décale...
                Fn_1 = Fn;
            }
        }
        
        return Fn;
    }
    
    static int demanderNombre(int a, int b) {
        int res;
        do {
            System.out.print("Entrez un nombre entier ");
            if (a >= b){
                System.out.print("supérieur ou égal à " + a);
            }else {
                System.out.print("compris entre " + a + " et " + b);
            }
            
            System.out.print(" : ");
            /* La lecture de la valeur au clavier est ici délibérément simplifiée
            on ne traite pas les situations où l'utilisateur se trompe
            au moment de la saisie*/
            res = scanner.nextInt();
        } while ((res < a) || ((a < b) && (res > b)));
        
        return res;
    }



}
