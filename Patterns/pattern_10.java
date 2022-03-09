import java.util.*;

public class pattern_10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();

     int row = 1 ,  nstar = 1 , nspace = n/2 ;

     while ( row <= n ) {
         //print each row
         //1.space
         for(int i = 1 ; i <= nspace ; i++){
             
             System.out.print("\t");
         }
         //2.star
         for(int i = 1 ; i <= nstar ; i++){
             if(i == 1 || i == nstar){
                 System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }
             
         }

         //move to next line
         System.out.println();

         //preparation for next row
         if (row <= n/2) {
             //first half
             nspace = nspace - 1;
             nstar = nstar + 2;
         } else {
             //second half
             nspace = nspace + 1;
             nstar = nstar - 2;
         }
         row++;
     }

 }
}
