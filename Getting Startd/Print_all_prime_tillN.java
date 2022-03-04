import java.util.*;

public class Print_all_prime_tillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
            //int t = scn.nextInt();
            int low = scn.nextInt();
            int high = scn.nextInt();
    
            
           for(int j = low; j <= high; j++){
           //int num = scn.nextInt();
    
           int flag = 1; //1 -> prime
           for(int i = 2; i*i <= j; i++){
             if(j % i == 0){
               // number is not prime
               flag = 0;
               break;
             }
           }
    
           if(flag == 1){
             System.out.println(j);
           }
           }
        }
}
