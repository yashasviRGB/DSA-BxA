class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2) return false;

        for(int i = 0; i< n1; i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            // if(map.containsKey(s1)){
                map.merge(s1, 1, Integer::sum);
            // }else{
                // map.put(key)
            // }
                map.merge(t1, -1, Integer::sum);
        }
 
        for(int value : map.values()){
            if(value != 0) return false;
        }
        return true;
    }
}