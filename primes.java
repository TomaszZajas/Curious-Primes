import java.util.*;
import java.lang.*;

public class primes{
    
   public static void main (String[] args) {
       String SampleInput1 = Prime(13);
       
       System.out.println(SampleInput1);
       
       String SampleInput2 = Prime(131);
       
       System.out.println(SampleInput2);
       
    }
    
   
   
   private static String convertFromBaseToBase(String str, int fromBase, int toBase) {
       
     return Integer.toString(Integer.parseInt(str, fromBase), toBase);
   }

   public static String Prime(int N){
        String check = "";
        
        String prime = String.valueOf(N); 
        int i = 2;
     if(isPrime(N)){
        while(i<=10){
            String ok = convertFromBaseToBase(prime, 10, i);
            int j = Integer.parseInt(ok);  
            if(isPrime(sumDigits(j))){
                check = "YES";
            }else{
                check = "";
                break;
            }
            
            i++;
        }
     }else{
       ;
     }
     
     if(check == ""){
            check = "NOT";
     }else if(check != ""){
            check = "YES";
     }
     return check;      
            
        
        
   }
        
        
        
   private static int sumDigits(int n) {
        
        int i = 0;
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;    
           
    }
    
   private static boolean isPrime(int n){
 
        
        if (n <= 1){
            return false;
 
        }else if (n == 2){
            return true;
 
        }else if (n % 2 == 0){
            return false;
        }
 
       
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
}
