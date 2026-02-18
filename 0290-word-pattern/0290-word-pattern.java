class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        String[] words = s.split(" ");
        int n1 = pattern.length();
        int n2 = words.length;

        if(n2 != n1) return false; 

        for(int i = 0; i < n2; i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                String temp = map.get(ch);
                if(!words[i].equals(temp)) return false;
            }
            else{
                if(set.contains(words[i])) return false;
                map.put(ch,words[i]);
                set.add(words[i]);
            }
        }
        return true;
    }
}