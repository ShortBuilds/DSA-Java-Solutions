class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1){
            if (!list1.contains(num)){
                list1.add(num);
            }
        }

        List<Integer> result= new ArrayList<>();
        for (int num : nums2){
            if(list1.contains(num)&& (!result.contains(num)))
            result.add(num);

        }
        int arr[] = new int[result.size()];
        for (int i =0; i<result.size(); i++){
            arr[i] = result.get(i);
        }
        return arr;
            }
        }
