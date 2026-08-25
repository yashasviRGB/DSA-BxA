class Solution {
    public int calculate(int a, int b, String ch){
        switch(ch){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return 0;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int n = tokens.length;
        for(int i = 0; i< n; i++){
            String ch = tokens[i];
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                st.push(Integer.parseInt(ch));
            }
            else{
                int right = st.pop();
                int left = st.pop();
                int value = calculate(left,right,ch);
                st.push(value);
            }
        }
        if(!st.isEmpty()) return st.pop();
        return 0;
    }
}