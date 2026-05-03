class Solution {
    public String addSpaces(String s, int[] spaces) {
        int m = s.length();
        int n = spaces.length;
        char[] result = new char[m+n];
        int k = 0;
        for(int i : spaces){
            k++;
            result[k+i-1] = ' ';
        }
        int j = 0;
        for(int i = 0; i < m+n; i++){
            char ch = s.charAt(j);
            if(result[i] != ' '){
                result[i] = ch;
                j++;
            }
        }
        String ans = new String(result);
        return ans;
    }
}