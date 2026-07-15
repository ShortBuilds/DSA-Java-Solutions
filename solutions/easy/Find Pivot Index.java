// Title: Find Pivot Index
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-pivot-index/

            int rightSum = totalSum - leftSum - nums[i];
            
        for (int i = 0; i < nums.length; i++) {
        }
        
        for (int num : nums) {
            totalSum += num;
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += nums[i];
        int leftSum = 0;
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
