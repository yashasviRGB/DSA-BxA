class Solution {
    public int myAtoi(String s) {
        int result = 0;
        char sign = '+';
        int n = s.length();
        if(n == 0) return 0;
        int i = 0;
        while(i < n && s.charAt(i) == ' ') i++;
        if(i == n) return 0;
        if(s.charAt(i) == '-'){
            sign = '-';
            i++;
        }
        else if(s.charAt(i) == '+') i++;

        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int x = s.charAt(i) - '0';
            i++;
            if(result > (Integer.MAX_VALUE - x) / 10){
                return sign == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result*10 + x;
        }
        if(sign == '-') return result * -1;
        return result;
    }
}