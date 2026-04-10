class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int n = s.length();
        int j = 0;
        int len = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        // set.add(s.charAt(0));
        while(j < n){
            char c = s.charAt(j);

            while(set.contains(c) && i < n){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len == Integer.MIN_VALUE ? 0 : len;
    }
}