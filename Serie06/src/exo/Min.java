package exo;

import java.util.Scanner;

public class Min {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println( min2(20, 10) );
        System.out.println( min3(1, 2, 3) );
       
        scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; ++i)
        {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            //Complete this line
            
            System.out.printf("%010-15s%03d %n", s1, x);
        }
        System.out.println("================================");
    }
    
    public static int min2(int a, int b) {
        if(a < b) {
            return a;
        }
        
        return b;
    }
    
    public static int min3(int a, int b, int c) {
        return min2(min2(a,b), c);
    }
}
