package exo;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the "findCompletePrefixes" function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY names
     *  2. STRING_ARRAY query
     */

    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
        List<Integer> completePrefixes = new ArrayList<>();
        for(int i = 0; i < query.size(); ++i) {
            completePrefixes.add( 0 );
            for(int j = 0; j < names.size(); ++j) {
                String val1 = names.get( j );
                String val2 = query.get( i );
                if(val1.startsWith( val2 ) && val1.length() > val2.length()) {
                    completePrefixes.set(i, completePrefixes.get( i ) + 1 );
                }
            }
        }
        
        return completePrefixes;

    }
    
    public static int countDistinctIntegers(int n) {
        // Write your code here
            List<Integer> distinctIntegers = new ArrayList<>();
            distinctIntegers.add(n);
            int x;
            for(int i = 0; i < distinctIntegers.size(); ++i) {
                
                
                int numberToTest = distinctIntegers.get(i);
                for(int j = 2; j < numberToTest; ++j){
                     x = numberToTest % j;
                    if(x == 1 && ! distinctIntegers.contains(numberToTest - j)){
                      
                        distinctIntegers.add(numberToTest - j);  
                        
                    }
                }
               
              
            }
            System.out.println(distinctIntegers);
            return distinctIntegers.size();
        }
    
    public static void main( String[] args ) {
//        String[] noms = {"steve","stevens","danny","steves","dan","john","johnny","joe","alex","alexander"};
//        List<String> names = Arrays.asList( noms );
//        
//        String[] requetes = {"steve","alex","joe","john","dan"};
//        List<String> query = Arrays.asList( requetes );
//        System.out.println( findCompletePrefixes( names, query ) );
        
        System.out.println(countDistinctIntegers(7)  );
    }

}