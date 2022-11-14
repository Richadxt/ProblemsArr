import java.util.*;

// FIND THE MISSING INTEGER

public class MissingInt {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 3, 5};
        int n = arr.length;
        System.out.println(fun1(arr,n));
    }
    public static int fun1(int arr[],int n){
//          SUM= N*(N+1)/2.

        int sum = ((n+1)*(n + 2)) / 2;
            for (int i = 0; i < n; i++)
                sum -= arr[i];
            return sum;
    }
}
