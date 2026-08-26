class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>= 0; i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) st.pop();

            if(st.isEmpty()) nge[i] = 0;
            else nge[i] = st.peek() - i;

            st.push(i);
        }
        // for(int i = 0; i<n; i++){
        //     if(nge[i] == -1) result[i] = 0;
        //     else result[i] = nge[i] - i;
        // }
        return nge;
    }
}