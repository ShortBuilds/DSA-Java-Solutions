// Title: Maximum Number of Vowels in a Substring of Given Length
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/

        for (int i = k; i<s.length(); i++){
            if (isVowel(s.charAt(i-k))){
                currentVowels--;
            }
            if(isVowel(s.charAt(i))){
                currentVowels++;
            }
            if (maxVowels<currentVowels)
            maxVowels = currentVowels;
        }
        return maxVowels;
    }
    private boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
}
