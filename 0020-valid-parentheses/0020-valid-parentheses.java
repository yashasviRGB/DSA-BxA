class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        for(int i = 0; i< n; i++){
            char x = s.charAt(i);
            if( x == '(' || x == '{' || x == '[' )
                stack.push(x);
            else{
                if(stack.isEmpty()) return false;
                char top = stack.peek();
                if ((x == ')' && top != '(') ||
                    (x == '}' && top != '{') ||
                    (x == ']' && top != '[')) {
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}