class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        int k =0;
        StringBuilder currentString = new StringBuilder();
        for (char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + ch - '0';
            }

            else if(ch =='['){
                count.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k=0;

            }

            else if (ch==']'){
                int currentK=count.pop();
                StringBuilder decode = stringStack.pop();

                for (int i=0; i<currentK; i++){
                    decode.append(currentString);
                }
                currentString = decode;
            }
            else
            {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}