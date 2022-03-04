import java.util.*;

public class Is_a_Number_prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();// For enter number oF test cases

        for (int j = 1; j <= t; j++) {
            int num = scn.nextInt();

            int flag = 1; // 1 -> prime
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    // number is not prime
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                System.out.println("prime");

            } else {
                System.out.println("not prime");
            }
        }

    }
}