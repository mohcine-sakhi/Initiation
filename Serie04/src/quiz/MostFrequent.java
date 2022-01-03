package quiz;
class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        
        // Version avec tri 
        //trier le tableau
//        for(int i = 0; i < taille -1; ++i) {
//            for(int j = i + 1; j < taille; ++j) {
//                if(tab1[i] > tab1[j]) {
//                    int temp = tab1[i];
//                    tab1[i] = tab1[j];
//                    tab1[j] = temp;
//                }
//            }
//        }
        
//        int index = 1;
//        int mostFrequent = tab1[0];
//        int frequency = 1;
//        

//        
//        while(index < taille) {
//            int j = 1;
//            while(index < taille && tab1[index -1 ] == tab1[index]) {
//                ++index;
//                ++j;
//            }
//            if(j > frequency) {
//                frequency = j;
//                mostFrequent = tab1[index - 1];
//            }
//            // Passer a l element suivant
//            ++index;
//        }
        
        int mostFrequent = tab1[0];
        int frequency = 1;
        
        for(int i = 0; i < taille -1; ++i) {
            int occurence = 1;
            for(int j = i + 1; j < taille; ++j) {
                
                if(tab1[i] == tab1[j]) {
                    ++occurence;
                }
            }
            if(occurence > frequency) {
                frequency = occurence;
                mostFrequent = tab1[i];
            }
        }
     
        
        System.out.println( "Le nombre le plus frequent dans le tableau est le :" );
        System.out.println( mostFrequent + " (" + frequency + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
