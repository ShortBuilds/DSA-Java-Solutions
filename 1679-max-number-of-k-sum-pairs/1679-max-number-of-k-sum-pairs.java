class Solution {
    public int maxOperations(int[] nums, int k) {
        int start=0, end =nums.length-1, count=0;
         Arrays.sort(nums);
         while (start<end) {
            if (nums[start]+nums[end]==k){
                count++;
                start++;
                end--;
            }
            else if (nums[start]+nums[end]<k){
                start++;
            }
            else 
                end--;
            
         }
         return count;
    }
}