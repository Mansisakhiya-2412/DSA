import java.util.*;

public class function_intro{

        public static void add1(int n1,int n2){
            int ans = n1 + n2;
            System.out.println(ans);
        }

        public static int add2(int n1, int n2){
            int ans = n1 + n2;
            return ans;
        }
   
   
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        add1(num1,num2);
        //add2(num1,num2);
    }
}
