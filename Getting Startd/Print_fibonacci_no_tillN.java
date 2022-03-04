import java.util.*;

public class Print_fibonacci_no_tillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
  
        int term = scn.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3 ;
  
        if(term == 1){
          System.out.println(t1);
        }else if(term == 2){
          System.out.println(t1);
          System.out.println(t2);
        }else{
           System.out.println(t1);
           System.out.println(t2);
  
          for (int i = 3; i <= term; i++){
          
          t3 = t1 + t2;
          System.out.println(t3);
          t1 = t2;
          t2 = t3;
  
        }
        }
  
        
     }
}
