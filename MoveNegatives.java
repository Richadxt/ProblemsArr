import java.util.*;
public class MoveNegatives {

     void movNeg(int arr[],int n){
         int[] ord=new int[n];
         int p=0;

         for(int i=0;i<n;i++) {
             if (arr[i] >= 0) {
                 ord[p] = arr[i];
                 p++;
             }
         }
         if(p==n || p==0) return;

         for(int i=0;i<n;i++) {
             if (arr[i] < 0) {
                 ord[p] = arr[i];
                 p++;
             }
         }
         for(int i=0;i<n;i++) {
             arr[i]=ord[i];
         }
     }


    public static void main(String[] args) {
        MoveNegatives negaT = new MoveNegatives();
        int arr[] = {18, -9, -4, 1, 6, 51, -10};
        int n = arr.length;
        negaT.movNeg(arr, n);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
