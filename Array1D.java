// A Java program to find a peak
// element using divide and conquer

import java.util.*;

public class Array1D{
        // A binary search based function that returns index of a peak element
        static int findPeakEle(int arr[], int low, int high, int n)
        {
            // low + (high - low) / 2
            int mid = low + (high - low) / 2;

            // Compare middle element with it neighbours (if neighbours exist)
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
                return mid;

                // If middle element is not peak and its left neighbor is greater than it, then left half must have a peak element
            else if (mid > 0 && arr[mid - 1] > arr[mid])
                return findPeakEle(arr, low, (mid - 1), n);

                // If middle element is not peak and its right neighbor is greater than it, then right half must have a peak element
            else
                return findPeakEle(arr, (mid + 1), high, n);
        }

        // A wrapper over recursive function
        // findPeakUtil()
        static int findPeak(int arr[], int n)
        {
            return findPeakEle(arr, 0, n - 1, n);
        }

        // Driver method
        public static void main(String[] args)
            {
                int arr[] = { 1, 3, 20, 4, 1, 0 };
                int n = arr.length;
                System.out.println("Index of a peak point is " + findPeak(arr, n));
        }
    }
