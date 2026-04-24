class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();

        for(String words : strs){
            //because String is Inmutable so we convert it to array of characters 
            //then sort it
            char[] arr = words.toCharArray();
            Arrays.sort(arr);
            //Again converted to string to store it in map
            String sortedWord = new String(arr);
            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord, new ArrayList<>());
            }
            mp.get(sortedWord).add(words);
        }
        return new ArrayList<>(mp.values());
        
    }
}