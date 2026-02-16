class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int front = 0;
        if(s.length() == 0) return 0;
        int end = 0;
        int len = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        for(int front = 0; front < s.length(); front++){
            char curr = s.charAt(front);
            if(set.contains(s.charAt(front))){
                char endch = s.charAt(end);
                while(endch != curr){
                    set.remove(endch);
                    end++;
                    endch = s.charAt(end);
                }
                end++;
                // set.add(s.charAt(front));
                // end = front;
            }else{
                set.add(s.charAt(front));
            }
            len = Math.max(len, front - end + 1);
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}