import java.util.*;

public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
   
        int n = scn.nextInt();  
        int digit = 0;
        while ( n > 0 ) {
           digit = n % 10;
          
          System.out.println(digit);
   
          n = n / 10;

           }
        
        
        
        
        }
    }
