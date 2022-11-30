import java.util.*;

// SUBARRAY WITH GIVEN SUM

public class SubarraySum {
        public static void subArr(int arr[], int n, int sum)
        {
            for (int i = 0; i < n; i++)
            {
                int curSum = arr[i];
                if (curSum == sum)
                {
                    System.out.println("Sum found at indexes " + i);
                    return;
                }
                else
                {
                    for (int j = i + 1; j < n; j++)
                    {
                        curSum += arr[j];

                        if (curSum == sum)
                        {
                            System.out.println("Sum found between indexes " + i + " and " + j);
                            return;
                        }
                    }
                }
            }
            System.out.println("No subarray found");
            return;
        }

        public static void main(String[] args) {
            int arr[] = {18, 9, 4, 1, 6, 51, 10};
            int n = arr.length;
            int sum = 14;
            subArr(arr, n, sum);
        }
}
