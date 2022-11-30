
// FIND MINIMUM AND MAXIMUM ELEMENT IN AN ARRAY

import java.util.*;

public class MinMax {

    public static void mM(int arr[]){
        int min=arr[0],max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max element is " + max);
        System.out.println("min element is " + min);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(" Array is: ");

        for(int j=0;j< arr.length;j++){
            System.out.print(" " + arr[j]);
        }
        System.out.println();
        mM(arr);
    }
}
