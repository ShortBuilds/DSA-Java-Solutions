// Title: Longest Subarray of 1's After Deleting One Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-subarray-of-1's-after-deleting-one-element/


            while (currentZero>1){
                if(nums[left]==0)
            }
                currentZero--;
                left++;
            int currentLength = right-left;
            if (currentLength>maxOnes)
            maxOnes = currentLength;
        }
        return maxOnes;
    }
}
