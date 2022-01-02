package quiz;

import java.util.Scanner;

public class Champi {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
        
        System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
        boolean reponse = scanner.nextBoolean();
        scanner.nextLine();
        
        if(! reponse) {
            System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
            reponse = scanner.nextBoolean();
            scanner.nextLine();
            if(reponse) {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("l'agaric jaunissant");
            }else {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("le coprin chevelu");
            }
            
        }else {
            System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
            reponse = scanner.nextBoolean();
            scanner.nextLine();
            if(reponse) {
                System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
                reponse = scanner.nextBoolean();
                scanner.nextLine();
                if(reponse) {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("l'amanite tue-mouches");
                }else {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le pied bleu");
                }
                
            }else {
                System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
                reponse = scanner.nextBoolean();
                scanner.nextLine();
                if(reponse) {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("la girolle");
                }else {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le cèpe de Bordeaux");
                }
            }
        }
    }

}
