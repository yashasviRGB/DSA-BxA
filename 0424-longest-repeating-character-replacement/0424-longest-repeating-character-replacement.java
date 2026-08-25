class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int maxFreq = 0;
        int maxLen = 0;
        int low = 0;
        int high = 0;
        while(high < n){
            char curr = s.charAt(high);
            freq[curr - 'A']++;
            maxFreq = Math.max(maxFreq, freq[curr - 'A']);
            while(high - low + 1 - maxFreq > k){
                freq[s.charAt(low) -  'A']--;
                low++;
            }
            maxLen = Math.max(maxLen, high - low + 1);
            high++;
        }
        return maxLen;

    }
}