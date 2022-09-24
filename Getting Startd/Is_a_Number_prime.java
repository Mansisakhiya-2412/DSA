// Is A Number Prime
// Easy

// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

// Constraints
// 1 <= t <= 10000
// 2 <= n < 10^9

// Format
// Input
// A number t
// A number n
// A number n
// .. t number of times

// Output
// prime
// not prime
// not prime
// .. t number of times

// Example
// Sample Input

// 5
// 13
// 2
// 3
// 4
// 5

// Sample Output
// prime
// prime
// prime
// not prime
// prime


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

https://www.figma.com/proto/Fd0iI85Cb8j9lyMee11ha3/Dreamhouse?node-id=111%3A21&scaling=scale-down-width&page-id=0%3A1&starting-point-node-id=1%3A2