// Title: Greatest Common Divisor of Strings
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/

            int temp = b;
            b = a%b;
            a =temp;
        }
        return a;
    } 
}
