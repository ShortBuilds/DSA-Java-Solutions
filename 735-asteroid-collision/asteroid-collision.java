class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int ast : asteroids) {
            boolean isAlive = true;
            
            while (!stack.isEmpty() && ast < 0 && stack.peek() > 0) {
                if (stack.peek() < Math.abs(ast)) {
                    stack.pop();
                    continue;
                } 
                else if (stack.peek() == Math.abs(ast)) {
                    stack.pop();
                }
                
                isAlive = false;
                break;
            }
            
            if (isAlive) {
                stack.push(ast);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}