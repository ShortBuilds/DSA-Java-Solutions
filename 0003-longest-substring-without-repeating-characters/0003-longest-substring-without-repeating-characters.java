class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(String.valueOf(s.charAt(i)))) {
                str += s.charAt(i);
            } else {
                if (str.length() > max)
                    max = str.length();
                str = str.substring(str.indexOf(s.charAt(i)) + 1) + s.charAt(i);
            }
        }
        if (str.length() > max)
            max = str.length();
        return max;

    }
}