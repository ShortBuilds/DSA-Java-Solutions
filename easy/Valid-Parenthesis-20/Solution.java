class Solution {
    public boolean isValid(String s) {
        Stack<Character> para = new Stack<>();
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='('||ch=='['||ch=='{')
                para.push(ch);
            else if (!para.isEmpty()&& para.peek()=='(' && ch == ')')
            para.pop();
            else if (!para.isEmpty()&& para.peek()=='[' && ch == ']')
            para.pop();
            else if (!para.isEmpty()&& para.peek()=='{' && ch == '}')
            para.pop();

            else return false;
        }
        return para.isEmpty();
    }
}
