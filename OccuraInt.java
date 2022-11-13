import java.util.*;

public class OccuraInt {
    public static  int occuR(int arr[],int N){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==N){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={2,67,34,1,89,67,56,67};
        int N=67;
        System.out.println(occuR(arr,N));
    }
}
