import java.util.*;

public class DigitsofANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        int n = scn.nextInt();
        int count = 0;
        int newno = n;
  
       while ( n != 0 ) {
        n = n/10;
        count = count + 1;
      }
  
       for(int i = 1; i <= count; i++ ){
        int k =  (newno/ (int)Math.pow(10,count - i) ) % 10 ; 
        System.out.println(k);
       }
        
  
  
       }
}
