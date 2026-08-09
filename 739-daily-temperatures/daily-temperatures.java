class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int result [] = new int[n];

        Deque <Integer> stack = new ArrayDeque<>();

        for (int i =0 ;i< n; i++){
            int currentTemp = temperatures[i];

            while(!stack.isEmpty() && currentTemp> temperatures[stack.peek()]) {
                int prevDayIndex = stack.pop();
                result[prevDayIndex] = i-prevDayIndex;
            }
            stack.push(i);
        }
        return result;
    }
}