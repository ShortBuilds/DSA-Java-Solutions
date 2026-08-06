import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // Start the backtracking with an empty StringBuilder, 0 open, 0 close, and max n
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> result, StringBuilder current, int openCount, int closeCount, int max) {
        // Base case: If our string length is 2 * n, we've used all pairs
        if (current.length() == max * 2) {
            result.add(current.toString());
            return;
        }
        
        // Choice 1: Add an open parenthesis if we haven't reached the max (Rule 1)
        if (openCount < max) {
            current.append("("); // 1. Choose
            backtrack(result, current, openCount + 1, closeCount, max); // 2. Explore
            current.deleteCharAt(current.length() - 1); // 3. Un-choose (Backtrack)
        }
        
        // Choice 2: Add a close parenthesis if it's valid to do so (Rule 2)
        if (closeCount < openCount) {
            current.append(")"); // 1. Choose
            backtrack(result, current, openCount, closeCount + 1, max); // 2. Explore
            current.deleteCharAt(current.length() - 1); // 3. Un-choose (Backtrack)
        }
    }
}