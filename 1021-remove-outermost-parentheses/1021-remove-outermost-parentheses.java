class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";   // To store the final result
        int balance = 0; // To keep track of the balance of parentheses

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // If balance is greater than 0, it means this '(' is not an
                // outermost parenthesis
                if (balance > 0) {
                    result += s.charAt(i); // Add the character to the result
                }
                balance++; // Increase the balance for '('
            } else {
                balance--; // Decrease the balance for ')'
                // If balance is greater than 0, it means this ')' is not an
                // outermost parenthesis
                if (balance > 0) {
                    result += s.charAt(i); // Add the character to the result
                }
            }
        }

        return result;
    }
}