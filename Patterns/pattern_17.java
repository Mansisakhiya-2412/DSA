import java.util.*;

public class pattern_17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int row = 1 , nstar = 1 ,nspace = n/2 ;

        while ( row <= n ) {
            //print each row
              //print spaces
            for(int i = 1 ; i <= nspace ; i++){
                if(row == n/2 +1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
              //print star
            for(int i = 1 ; i <= nstar ; i++){
                    System.out.print("*\t");
            }
            //move to next line
            System.out.println();
            //preparation for next row
            if (row <= n/2) {
                //first half
                nstar++;
            } else {
                //second half
                nstar--;
            }
            row++;
        }

    }
}