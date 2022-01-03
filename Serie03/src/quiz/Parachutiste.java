package quiz;


import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        final double G = 9.81;
        double v0 = 0.0;
        double t0 = 0.0;
        
        double vitesse = v0;
        double hauteur = h0;
        double accel = G;
        double t = t0;
        double surface = 2.0;
        final double VITESSE_SON = 343.0;
        boolean vitesseSonAtteinte = false;
        final double ACCELERATION_LIMITE = 0.5;
        boolean vitesseMaximaleAtteinte = false;
        final double HAUTEUR_LIMITE = 2500;
        boolean parachuteOuvert = false;
        boolean chuteABasseAltitude = false;
        
        if(h0 < HAUTEUR_LIMITE) {
            chuteABasseAltitude = true;
        }
        double s = surface / masse;
        double q ;
        
        while (hauteur > 0) {
            q = Math.exp( -s * (t - t0) );
            vitesse = (G / s) * (1 - q) + v0 * q;
            hauteur = h0 - (G / s) * (t - t0) - ((v0 - (G / s)) / s) * (1 - q);
            accel = G - s * vitesse;
            if(!vitesseSonAtteinte  && vitesse > VITESSE_SON  ) {
                System.out.println( "## Felix depasse la vitesse du son" );
                vitesseSonAtteinte = true;
            }
            if(!vitesseMaximaleAtteinte  && accel < ACCELERATION_LIMITE  ) {
                System.out.println( "## Felix a atteint sa vitesse maximale");
                vitesseMaximaleAtteinte = true;
            }
          
            // On ne saute pas qd mm parachute ouvert
            if(!parachuteOuvert && !chuteABasseAltitude && hauteur < HAUTEUR_LIMITE ) {
                System.out.println( "## Felix ouvre son parachute");
                parachuteOuvert = true;
                surface = 25.0;
                s = surface / masse; 
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
              
            }
            
           if(!parachuteOuvert && chuteABasseAltitude) {
               chuteABasseAltitude = false;
           }
            
            if(hauteur >= 0) {
                System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
            }
            
             ++t;
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
