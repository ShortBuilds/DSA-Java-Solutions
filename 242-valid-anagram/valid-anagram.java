class Solution {
    public boolean isAnagram(String s, String t) {

        /*if (s.length() != t.length()) {
            return false;
        }
        
        int[] letterCounts = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            letterCounts[s.charAt(i) - 'a']++;
            
            letterCounts[t.charAt(i) - 'a']--;
        }
        
        for (int count : letterCounts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;*/

        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr, tarr);
    }
}