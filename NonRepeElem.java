// FIND FIRST NON REPEATING ELEMENT IN ARRAY OF INTEGERS

public class NonRepeElem {

        public static int fNonRepT(int arr[], int n)
        {
            for (int i = 0; i < n; i++) {
                int j;
                for (j = 0; j < n; j++)
                    if (i != j && arr[i] == arr[j])
                        break;
                if (j == n)
                    return arr[i];
            }
            return -1;
        }

        // Driver code
        public static void main(String[] args)
        {
            int arr[] = { 4, 9, 7, 9, 4 };
            int n = arr.length;
            System.out.print(fNonRepT(arr, n));
        }
    }

