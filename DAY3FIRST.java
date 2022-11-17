// FIND THE LARGEST SUM OF CONTIGUOUS SUBARRAY

public class DAY3FIRST {
    public static void main(String[] args){
        int arr[]={4,-5,9,-6};
        System.out.println(maxsum(arr));

    }
    static int maxsum(int a[])
    {
         int largestSum = Integer.MIN_VALUE;   //-2^31   //lowest sum
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum < 0) {
                sum = 0;
            }
            if (largestSum < sum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }
}
