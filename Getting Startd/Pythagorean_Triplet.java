import java.util.*;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
    
        int A = a*a;
        int B = b*b;
        int C = c*c;
       
       if((A == B+C) || (B == A+C) || (C == A+B) ){
         System.out.println("true");
       }else{
         System.out.println("false");
       }
           
      }
}
