class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        int resLen = 0;
        String res = "";
        
        for (int i = 0; i < s.length(); i++) {
            // CASE 1: Odd length palindromes (e.g., "aba")
            // FIX: Initialize both l and r properly
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
            
            // CASE 2: Even length palindromes (e.g., "baba")
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    res = s.substring(l, r + 1);
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return res;
    }
}