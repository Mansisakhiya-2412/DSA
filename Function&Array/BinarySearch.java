import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<arr.length;i++)
            {
            arr[i]=scn.nextInt();
            }
        int k = scn.nextInt();

        System.out.println((binarySearch(arr, k)));

    }

    public static int binarySearch(int[] arr , int k) {
        
        int startp = 0 , endp = arr.length - 1;
        int mid = (startp + endp) / 2;

        while(startp <= endp){

            if(arr[mid] < k){
                startp = mid + 1;
            }else if(arr[mid] > k){
                endp = mid - 1;
            }else{
                 return mid;
            }

            return -1;
        }

        
    }
}
