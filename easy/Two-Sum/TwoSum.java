class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int num: nums) list.add(num);

        int arr[] = new int[2];
        for (int i =0; i<nums.length; i++){
            int comp = target-nums[i];
            if(list.contains(comp)&& list.indexOf(comp)!=i){
            arr[0] = i;
            arr[1] = list.indexOf(comp);
            break;
            }
        }

        return arr;
    }
}
