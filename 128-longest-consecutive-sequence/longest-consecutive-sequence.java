import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Base case: if the array is empty, the longest sequence is 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Add all elements to a HashSet for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the HashSet
        for (int num : numSet) {
            // Only start counting if 'num' is the FIRST element of a sequence
            // (i.e., num - 1 does not exist in the set)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Keep checking for the next consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the maximum streak found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}