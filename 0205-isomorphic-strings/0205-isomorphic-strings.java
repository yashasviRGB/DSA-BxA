class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        int n1 = s.length(); 
        int n2 = t.length();
        if(n1 > n2) return false;

        for(int i = 0; i < n1;i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(map.containsKey(s1)){
                char temp = map.get(s1);
                if(t1 != temp) return false;
            }
            else{
                if(set.contains(t1)) return false;
                map.put(s1,t1);
                set.add(t1);
            }
        }
        return true;
    }
}