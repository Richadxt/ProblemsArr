
// FIND KTH LARGEST AND KTH SMALLEST ELEMENT IN THE ARRAY

import java.util.*;

public class KthLargest {
    public static int kthSmallest(int arr[],int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static int kLarg(int[] arr,int k){
        int n= arr.length;;
        Arrays.sort(arr);
        int b[]=new int[arr.length];
        for (int i = 0; i < n; i++) {
            b[i]=arr[n-1];
            n--;
        }
        return b[k-1];
    }
    public static void main (String[] args)
    {
        int arr[] = new int[]{10,5,30,12};

        int n = arr.length;
        int k=2;

        System.out.println(kthSmallest(arr,k));
        System.out.println(kLarg(arr,k));

    }
}
