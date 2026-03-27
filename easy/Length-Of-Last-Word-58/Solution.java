class Solution {
    public int lengthOfLastWord(String s) {
        String word[] = s.split(" ");
        String lastWord = word[word.length-1];
        int l = lastWord.length();
        return l;
    }
}
