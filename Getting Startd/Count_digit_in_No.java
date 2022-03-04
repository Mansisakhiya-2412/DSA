import java.util.*;

public class Count_digit_in_No {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        int n = scn.nextInt();
        int count = 0;
        while ( n != 0 ) {
          n = n/10;
          count = count + 1;
        }
        System.out.println(count);
       }
}
