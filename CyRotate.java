// WRITE A PROGRAM TO CYCLICALLY ROTATE AN ARRAY BY ONE

import java.util.Arrays;

public class CyRotate {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 7, 8};
        int n = arr.length;
        fun(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void fun(int[] arr, int n){
        int i = 0, j = arr.length - 1;
        while(i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }
}
