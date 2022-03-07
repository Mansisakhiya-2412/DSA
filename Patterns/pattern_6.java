import java.util.*;

public class pattern_6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int row = 1 , nspace = 1 , nstar = (n/2)+1;

        while ( row <= n ) {
            //code for each row
              //1.print star
            for(int i = 1 ; i<= nstar ; i++){
                System.out.print("*\t");
            }
              //2. print space
            for(int i = 1; i <= nspace ; i++){
                System.out.print("\t");
            }
              //3. print star
            for(int i = 1 ; i<= nstar ; i++){
                System.out.print("*\t");
            }
            //move to new line
            System.out.println();

            //preparation for next row
            if (row <= n/2) { 
                //first half
                nspace = nspace + 2 ;
                nstar = nstar - 1;;
            } else { 
                //second half
                nspace = nspace - 2 ;
                nstar = nstar+1 ;
            }
            row++;
        }


    }
}
