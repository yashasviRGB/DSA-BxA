class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int result = 0;
        for(int i = 1; i< n;i++){
            int curr = mp.get(s.charAt(i-1));
            int next = mp.get(s.charAt(i));
            if(curr < next) result -= curr;
            else result += curr;
        }
        result += mp.get(s.charAt(n-1));
        return result;
    }
}