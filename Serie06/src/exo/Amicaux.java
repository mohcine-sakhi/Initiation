package exo;

public class Amicaux {
    
    public static void main(String[] args) {
        int[] nombres = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
        System.out.println("Les paires de nombres amicaux sont : ");
        afficherAmicaux(nombres);

    }
    
    public static int sommeDeviseurs(int nb) {
        int sommeDeviseurs = 0;
        
        for(int i = 1; i <= nb; ++i) {
            if(nb % i == 0 ) {
                sommeDeviseurs += i; 
            }
        }
        
        return sommeDeviseurs;
    }
    
    public static boolean amicaux(int nb1, int nb2) {
        int somme = sommeDeviseurs(nb1);
        
        return (nb1 + nb2) ==  somme && sommeDeviseurs(nb2) == somme ;
    }
    
    public static void afficherAmicaux(int[] nombres) {
        for(int i = 0; i < nombres.length - 1; ++i) {
            for(int j = i + 1; j < nombres.length; ++j) {
                if(amicaux(nombres[i], nombres[j])) {
                    System.out.println(nombres[i] + " " + nombres[j]);
                }
            }
        }
    }
    
   
}
  