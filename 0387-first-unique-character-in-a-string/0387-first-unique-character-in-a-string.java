class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        int size = s.length();
        for(int i = 0; i<size; i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0) + 1);
        }
        for(int i = 0; i < size; i++){
            char ch = s.charAt(i);
            if(freq.get(ch) == 1) return i;
        }
        return -1;
    }
}