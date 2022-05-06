import java.util.Scanner;

public class print_incresing {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        printIncresing(n);
    }

    public static void printIncresing(int n) {
        if(n == 0){
            return;
        }
        printIncresing(n-1);
        System.out.println(n);
    }
}
