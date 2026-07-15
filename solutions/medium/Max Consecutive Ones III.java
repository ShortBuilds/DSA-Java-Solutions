// Title: Max Consecutive Ones III
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/max-consecutive-ones-iii/

            }
                zeroCount--;
                left++;
            int currentWindowSize = right-left+1;
            if (maxOnes<currentWindowSize){
                maxOnes = currentWindowSize;
            }
        }
        return maxOnes;

        }
    }

