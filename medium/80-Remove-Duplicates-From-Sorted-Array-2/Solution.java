class Solution {
    public int removeDuplicates(int[] nums) {
        
        int c=0;
            for (int n : nums){
                if (c<2 || n!=nums[c-2])
                {
                    nums[c++]=n;
                }
        }
        return c;
    }
}
