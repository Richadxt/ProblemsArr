// FIND COMMON ELEMENT IN SORTED ARRAYS

import java.util.*;

public class Common3SortedArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 9, 10};
        int[] arr2 = {1, 3, 4, 6, 8, 9};
        int[] arr3 = {1, 2, 5, 7, 9, 10};
        fun1(arr1,arr2,arr3);
    }
    public static void fun1(int arr1[],int arr2[],int arr3[]){
                int i = 0, j = 0, k = 0;

                while (i < arr1.length && j < arr2.length && k < arr3.length) {
                    //   x==y && y==z
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        System.out.print(arr1[i] + " ");
                        i++;
                        j++;
                        k++;
                    }
                    // x < y
                    else if (arr1[i] < arr2[j])
                        i++;
                        // y < z
                    else if (arr2[j] < arr3[k])
                        j++;
                        // We reach here when x > y and y > z, i.e., z
                        // is smallest
                    else
                        k++;
                }

    }
}
