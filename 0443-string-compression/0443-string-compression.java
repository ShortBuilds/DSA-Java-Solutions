class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int anchor = 0;

        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    int count = read - anchor + 1;
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                
                anchor = read + 1;
            }
        }
        return write; 
    }
}