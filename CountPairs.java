import java.util.*;
//COUNT PAIRS WITH GIVEN SUM

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 2, 5, 10};
        int n = arr.length;
        int k = 15;
        System.out.println(fun1(arr,n,k));
    }
    public static int fun1(int arr[],int n, int k){
        int count=0;
        for (int i = 0;i < n;i++){
            for(int j=0;j< n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
