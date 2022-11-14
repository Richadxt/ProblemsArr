//SORT AN ARRAY BY USING QUICK SORT ALGORITHM

import java.util.*;

public class QuickSort {
    public static void qSort(int arr[],int low,int high){
        if(low<high) {
            int p = quickSort(arr, low, high);
            qSort(arr, low, p);
            qSort(arr, p + 1, high);
        }
    }
    public static int quickSort(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low-1, j=high+1;

        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 5, 10};
        int n = arr.length;
        qSort(arr,0,n-1);
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
