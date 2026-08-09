class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque <Integer> stack = new ArrayDeque<>();

        for (String i: tokens){

            if(i.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(i.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(i.equals("-")){
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left-right);
            }
            else if(i.equals("/")){
                int divisor = stack.pop();
                int dividend = stack.pop();
                stack.push(dividend/divisor);
            }
            else stack.push(Integer.parseInt(i));
        }
        return stack.pop();
    }
}