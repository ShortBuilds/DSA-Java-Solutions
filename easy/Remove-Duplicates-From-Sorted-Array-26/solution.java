class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        for (int i =0; i<nums.length-1; i++){
            if (nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
        nums[count]= nums[nums.length-1];
        count++;
        return count;
    }
}
