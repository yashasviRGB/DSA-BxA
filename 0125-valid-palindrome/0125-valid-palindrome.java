class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length();
        int j = n - 1;
        while (i < j) {
            char x = s.charAt(i);
            while (i < j && !Character.isLetterOrDigit(x)) {
                i++;
                x = s.charAt(i);
            }
            char y = s.charAt(j);
            while (i < j && !Character.isLetterOrDigit(y)) {
                j--;
                y = s.charAt(j);
            }
            if (Character.toLowerCase(x) != Character.toLowerCase(y)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}