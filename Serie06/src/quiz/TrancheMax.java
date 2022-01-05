package quiz;
import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    public static boolean checkLineLength(String matrice) {
        String matriceEpuree = matrice.trim();
        String[] lignes = matriceEpuree.split( " {1,}" );
        int taille = lignes[0].length();
        for(int i = 1; i < lignes.length; ++i) {
            if(lignes[i].length() != taille) {
                System.out.println("Matrice invalide, lignes de longueurs differentes !");
                return false;
            }
        }
        return true;
    }

    public static boolean checkFormat(String matrice) {
        String matriceEpuree = matrice.trim();
        if(matriceEpuree == null || matriceEpuree.length() == 0) {
            System.out.println("Matrice vide !");
            return false;
        }
        for ( int i = 0; i < matriceEpuree.length(); i++ ) {
            if(! (matriceEpuree.charAt( i ) == ' ' || matriceEpuree.charAt( i ) == '0' || matriceEpuree.charAt( i ) == '1')) {
                System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
                return false;
            }
        }
        
        return checkLineLength(matrice);
    }

    public static int maxConsecutiveOne(String ligne) {
        int i = 0;
        int maxConsecutiveOne = 0;
        while(i < ligne.length()) {
            if(ligne.charAt( i ) == '1'){
                int nbOfOnes = 1;
                while(i < ligne.length() - 1 && ligne.charAt( i + 1 ) == '1') {
                    ++nbOfOnes;
                    ++i;
                }
                maxConsecutiveOne = (maxConsecutiveOne > nbOfOnes) ? maxConsecutiveOne : nbOfOnes;
            }
            ++i;
        }
        
        return maxConsecutiveOne;
    }

    public static ArrayList<Integer> findConsecutiveList(String matrice){
        
        
        ArrayList<Integer> maxConsecutifList = new ArrayList<>();
        String matriceEpuree = matrice.trim();
        String[] lignes = matriceEpuree.split( " {1,}" );
        int maxConsecutiveOne = 0;
        for ( int j = 0; j < lignes.length; j++ ) {
           maxConsecutiveOne = (maxConsecutiveOne > maxConsecutiveOne( lignes[j] )) ? maxConsecutiveOne : maxConsecutiveOne( lignes[j] );
        }
       if(maxConsecutiveOne != 0) {
           for ( int j = 0; j < lignes.length; j++ ) {
               if(maxConsecutiveOne == maxConsecutiveOne( lignes[j] )) {
                   maxConsecutifList.add( j );
               }
           }  
       }
        
        return maxConsecutifList;
    }






    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}