import java.util.Scanner;



public class print_incresing_decresing {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        pdi(n);
    }

    public static void pdi(int n) {
        
        if(n == 0){
            return;
        }

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
