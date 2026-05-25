class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();   // To store the final result
        int balance = 0; // To keep track of the balance of parentheses

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                // If balance is greater than 0, it means this '(' is not an
                // outermost parenthesis
                if (balance > 0) {
                    result.append(ch); // Add the character to the result
                }
                balance++; // Increase the balance for '('
            } else {
                balance--; // Decrease the balance for ')'
                // If balance is greater than 0, it means this ')' is not an
                // outermost parenthesis
                if (balance > 0) {
                    result.append(ch); // Add the character to the result
                }
            }
        }

        return result.toString();
    }
}