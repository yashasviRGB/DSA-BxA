class Solution {
    class Pair{
        char first;
        int second;
        public Pair(char a, int b){
            this.first = a;
            this.second = b;
        }
    }
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for(char ch: s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0) + 1);
        }

        Queue<Pair> q = new PriorityQueue<>((a,b) -> Integer.compare(b.second,a.second));
        
        for(char ch : mp.keySet()){
            q.offer(new Pair(ch, mp.get(ch)));
        }
        StringBuilder result = new StringBuilder();
        while(!q.isEmpty()){
            Pair temp = q.poll();
            for(int i = 1; i<= temp.second; i++){
                result.append(temp.first);
            }
        }
        return result.toString();
    }
}