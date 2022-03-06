import java.util.*;

public class pattern_9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

       for(int row = 1 ; row <= n ; row++){
           for(int col = 1 ; col <= n ; col++){
               if (col == row || col + row == n+1) {
                   System.out.print("*\t");
               } else {
                   System.out.print("\t");
               }
           }
           System.out.println();
       }

    }
}