import java.util.*;

public class pattern_12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int count = 1,t1 = 0 , t2 = 1, t3;
       
        for(int row = 1; row <= n; row++){

            for(int col = 1; col <= row ; col++ ){
               
                    t3 = t1 + t2;
                    System.out.print(t1+"\t");
                    t1=t2;
                    t2= t3;
            }
            System.out.println();
        }

    }
}