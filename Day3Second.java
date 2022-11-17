// FIND IF THERE IS ANY SUBARRAY WITH A SUM EQUAL TO ZERO

public class Day3Second {
    public static void fun(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==0){
                    System.out.println(" { "+ i +" , " + j +" } ");
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,-7,4,-9, 7, 6 , 9};
        fun(arr);
    }
}
