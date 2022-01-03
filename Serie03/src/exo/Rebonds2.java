package exo;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Rebonds2 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
//        final double G = 9.81; 
//        double h0;
//        double eps;
//        double hauteurFinale;
//        
//        scanner.useLocale( Locale.ENGLISH );
//        
//        do {
//            System.out.print( "Entrer une hauteur initiale positve : " );
//            h0 = scanner.nextDouble();
//        }while(h0 <= 0);
//        
//        do {
//            System.out.print( "Entrer esp compris entre 0 et 1 : " );
//            eps = scanner.nextDouble();
//        }while(eps < 0 || eps >= 1);
//        
//        do {
//            System.out.print( "Entrer la hauteur finale : " );
//            hauteurFinale = scanner.nextDouble();
//        }while(hauteurFinale <= 0  || hauteurFinale >= h0);
//        
//        
//        double vitesseDArivee;
//        double vitesseRebonds;
//        double hauteurApresRebonds = h0;
//        int nbRebonds = 0;
//       do{
//            vitesseDArivee = Math.sqrt( 2 * hauteurApresRebonds * G );
//            vitesseRebonds = eps * vitesseDArivee;
//            hauteurApresRebonds = Math.pow( vitesseRebonds, 2 ) / (2 * G);
//            nbRebonds++;
//
//        }while(hauteurApresRebonds >= hauteurFinale);
//        
//        System.out.println( "La balle fait " + nbRebonds + " rebonds  avant que la hauteur à laquelle " + 
//                "elle rebondit soit plus petite que (ou égale à) "+ hauteurFinale );
   
    PriorityQueue toDo = new PriorityQueue<>();
    toDo.add("d");
    toDo.add("l");
    toDo.add("b");
    toDo.offer("b");
    
    System.out.println( toDo.size() + " " + toDo.poll() );
    System.out.println( toDo.peek() + " " + toDo.poll() );
    System.out.println( toDo.poll() + " " + toDo.poll() );
    
    }
}
