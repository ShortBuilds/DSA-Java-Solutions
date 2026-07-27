class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> list = new HashSet<>();
        for (int i : nums){
            if (!list.contains(i))
            list.add(i);
            else return true;
        }
         return false;
    }
}