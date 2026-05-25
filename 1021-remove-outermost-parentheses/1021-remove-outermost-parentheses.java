class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        String result = "";
        int open = 0;
        for(int i = 0; i< n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(open > 0) result += ch;
                open++;
            }
            else{
                open--;
                if(open > 0) result += ch;
            }
            
        }
        return result;
    }


    // public solve(String s){
    //     Stack<Character> st = new Stack<>();
    //     int n = s.length();
    //     String result = "";
    //     for(int i = 0; i<n; i++){
    //         char ch = s.charAt(i);
    //         if(ch == '('){
    //             if(st.size() == 0){
    //                 st.push(ch);
    //             }
    //             else{
    //                 st.push(ch);
    //                 result += ch;
    //             }
    //         }
    //         else{
    //             if(st.size() > 1)
    //                 result += ch;
    //             st.pop();
    //         }
    //     }
    //     return result;
    // }
}