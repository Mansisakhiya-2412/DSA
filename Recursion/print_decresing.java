import java.util.Scanner;

public class print_decresing {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        PrintDecresing(n);
    }

    public static void PrintDecresing(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        PrintDecresing(n - 1);//Faith
    }
}
