import java.util.*;

public class UnionAndInter {
    static void intersection(int[] a,int[] b,int m,int n){
        int i=0,j=0;
        while(i<m && j<n){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.println(a[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main (String[] args)
    {
        int a[] = new int[]{3,8,8};
        int b[] = new int[]{2,8,8,10,15};

        int m = a.length;
        int n = b.length;
        intersection(a, b, m, n);
        }
}
