import java.util.*;

public class SecondLargest {

    public static void main(String[] args){
        int  arr[]={3,5,6,2,8,9};
        fun1(arr);
    }
    public static void fun1(int []arr){
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < s) {
                s = arr[i];
            }
        }
            System.out.println("first smallest element is " + s);
        for(int j=0;j<arr.length;j++) {
            if (arr[j] > s && arr[j] < ss) {
                ss = arr[j];
            }
        }
                System.out.println("second smallest element is " + ss);
    }
}
