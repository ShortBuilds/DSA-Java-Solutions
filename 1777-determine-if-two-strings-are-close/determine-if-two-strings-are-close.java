import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        // Early exit: lengths must be identical
        if (word1.length() != word2.length()) {
            return false;
        }
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        // Count character frequencies
        // Since lengths are equal, we can do this in a single loop
        for (int i = 0; i < word1.length(); i++) {
            count1[word1.charAt(i) - 'a']++;
            count2[word2.charAt(i) - 'a']++;
        }
        
        // Condition 1: Both strings must contain the same set of unique characters
        for (int i = 0; i < 26; i++) {
            // If one string has a character and the other doesn't, they aren't close
            if ((count1[i] == 0 && count2[i] > 0) || (count1[i] > 0 && count2[i] == 0)) {
                return false;
            }
        }
        
        // Condition 2: The frequency distributions must be identical
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        return Arrays.equals(count1, count2);
    }
}