public class Arrayintro {

    public static void main(String arg[]) {

        int arr[] = new int[5];

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        arr[0] = 5;
        arr[1] = 1;
        arr[2] = -3;
        arr[3] = 2;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        // System.out.println("length : "+arr.length);

        // for( int idx = 0 ; idx <= arr.length ; idx++){
        //     int val = arr[idx];
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        for(int pepcoding : arr){
            System.out.print(pepcoding+" ");
        }
        System.out.println();
    }

    
}