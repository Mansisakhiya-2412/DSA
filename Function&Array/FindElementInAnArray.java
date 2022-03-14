import java.io.*;
import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();// input
        int arr[] = new int[n];// arr
        for (int idx = 0; idx <= arr.length - 1; idx++) {
            arr[idx] = scn.nextInt();
        }
        int ele = scn.nextInt();// ele

        int res = find(arr, ele);
        System.out.println(res);
    }

    public static int find(int arr[], int ele){
        //logic
        for(int idx = 0 ; idx <= arr.length-1 ; idx++){
            if(arr[idx] == ele){
                return idx;//element Found
            }
           
        }
        return -1;//element  not Found
    }
}
