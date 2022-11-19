// FIND THE LONGEST CONSECUTIVE

import java.util.Arrays;

public class Day5Longest_Consecutive {
        public static int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);
            int longestStreak = 1;
            int currentStreak = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i-1]) {
                    if (nums[i] == nums[i-1]+1) {
                        currentStreak += 1;
                    }
                    else {
                        longestStreak = Math.max(longestStreak, currentStreak);
                        currentStreak = 1;
                    }
                }
            }
            return Math.max(longestStreak, currentStreak);
        }
    public static void main(String[] args){
        int arr[]={3,7,4,8,1,2};
        System.out.println(longestConsecutive(arr));
    }
}
