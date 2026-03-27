class Solution {
    public String intToRoman(int num) {
        int value[]= {1000, 900, 500, 400, 100, 90, 50, 40, 10,9,5,4,1};
        String [] romanval = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result="";
        for (int i =0; i<value.length; i++){
            while (num>=value[i]){
                result=result + romanval[i];
                num-= value[i];

            }
        }
        return result;
    }
}
