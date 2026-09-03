class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length()> s2.length()) return false;

        int count1[] = new int[26];
        int count2[] = new int[26];
        for (char c : s1.toCharArray()){
            count1[c - 'a']++;
        }

        int k = s1.length();

         for (int i =0 ;i<s2.length(); i++){

            count2[s2.charAt(i) - 'a']++;

            if (i>=k) count2[s2.charAt(i-k)-'a']--;

            if (Arrays.equals(count1, count2))
                return true;
        }

        return false;
    }
}