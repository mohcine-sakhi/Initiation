package exo;

import java.util.Scanner;

public class Palindrome {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print( "Entrez un mot ou une phrase : " );
        String phrase =  scanner.nextLine();
        
        phrase = phrase.trim();
        phrase = phrase.toLowerCase();
        String phraseSansCaracteresSpeciaux = "";
        
        for(int i = 0; i < phrase.length(); ++i) {
            if(Character.isLetter( phrase.charAt( i ) )) {
                phraseSansCaracteresSpeciaux += phrase.charAt( i );
            }
        }
        
        boolean palindrome = true;
        
        for ( int i = 0; palindrome && i < phraseSansCaracteresSpeciaux.length() / 2; i++ ) {
            if(phraseSansCaracteresSpeciaux.charAt( i ) != phraseSansCaracteresSpeciaux.charAt( phraseSansCaracteresSpeciaux.length() - 1 - i)) {
                palindrome = false;
            }
            
        }
        
        if(palindrome) {
            System.out.println( "C'est un palindrome !" );
        }else {
            System.out.println( "Ce n'est pas un palindrome !" );
        }
    }
}
