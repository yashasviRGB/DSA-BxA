class Solution {

    public void solve(Map<Character, Integer> mp1, String str, int inc){
        int n = str.length();
        for(int i = 0; i < n; i++){
            char temp = str.charAt(i);
            mp1.merge(temp, inc, Integer::sum);
        }
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mp1 = new HashMap<>();
        // Map<Character, Integer> mp1 = new HashMap<>();

        int n1 = magazine.length();
        
        int i = 0;
        // int j = 0;
        solve(mp1, magazine,1);
        solve(mp1, ransomNote,-1);

        Iterator<Map.Entry<Character, Integer>> it = mp1.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();

            Character key = entry.getKey();
            Integer value = entry.getValue();

            // System.out.println(key + " " + value);
            if(value < 0) return false;
        }
        return true;
        
    }
}