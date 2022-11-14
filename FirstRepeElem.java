// FIND FIRST REPEATING ELEMENT IN ARRAY OF INTEGERS

import java.util.HashSet;

public class FirstRepeElem {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 8, 5, 10};
        fun1(arr1);
    }
    public static void fun1(int arr[]){
        int min = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;
            else
                set.add(arr[i]);
        }
        // Print the result
        if (min != -1)
            System.out.println("The first repeating element is " + arr[min]);
        else
            System.out.println("There are no repeating elements");
}
}
