class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque <Integer> stack = new ArrayDeque<>();

        for (String token : tokens){

            if (token.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if (token.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if (token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if (token.equals("/")){
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left/right);
            }
            else 
            {
                stack.push(Integer.parseInt(token));
            }
            
        }
        return stack.pop();
    }
}