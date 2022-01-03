package exo;

public class SuiteEtSerie {
    public static void main(String[] args) {
        double U0 = 1;
        double Un = 1;
        
        System.out.println( "U0 = " + U0 );
        System.out.println( "U1 = " + Un );
        
        double Vn = U0 + Un;
        for(int i = 2; i <= 10; ++i) {
            Un = U0 / i;
            U0 = Un;
            Vn += Un;
            System.out.println( "U" + i + " = " + Un );
        }
        
        System.out.println( "Vn = " + Vn );
        
    }

}
