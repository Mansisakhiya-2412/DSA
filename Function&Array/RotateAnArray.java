import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

   public static void reverse(int[] a,int lo,int hi){
    while(lo < hi){
      // swap
      int temp = a[lo];
          a[lo] = a[hi];
          a[hi ] = temp;
      lo++;
      hi--;
    }
  }
  public static void rotate(int[] a, int k){
    int n = a.length;
    // true rotation
    k = k % (a.length);
    // negative rotation
    if(k < 0){
      k = a.length + k;
    }

    // reverse p2
    reverse(a,0,a.length-k-1);
    // reverse p1
    reverse(a,a.length-k,a.length-1);
    // reverse a
    reverse(a,0,n-1);
  }


public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}