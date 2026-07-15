// Title: Find the Highest Altitude
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt =0;
        int netSum =0;
        for (int i =0; i<gain.length; i++){
            netSum =netSum+ gain[i];

        }
    }
            if(netSum>maxAlt)
            maxAlt = netSum;
        return maxAlt;
}
