class Solution {
    public boolean checkFreq(int[] freqS1, int[] freqS2){
        boolean result = false;
        for(int j = 0; j<26; j++){
            if(freqS1[j] == freqS2[j]){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freqS1 = new int[26];
        int n1 = s1.length();
        int n2 = s2.length();
        int low = 0;
        if(n1 > n2) return false;
        for(int i = 0; i< n1; i++){
            freqS1[s1.charAt(i) - 'a']++;
        }
        int[] freqS2 = new int[26];

        for(int i = 0; i<n1; i++){
            freqS2[s2.charAt(i) - 'a']++;
        }
        boolean result = false;
        int i = n1;
        while(i < n2){
            result = checkFreq(freqS1, freqS2);
            if(result) return result;
            freqS2[s2.charAt(low) - 'a']--;
            freqS2[s2.charAt(i) - 'a']++;
            low++;
            i++;
        }
        result = checkFreq(freqS1, freqS2);
        return result;
    }
}