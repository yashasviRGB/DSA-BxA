class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b)->{
                int cmp = b.getValue().compareTo(a.getValue());
                if(cmp == 0) cmp = b.getKey().compareTo(a.getValue());

                return cmp;
            }
        );

        pq.addAll(mp.entrySet());
        int[] result = new int[k];
        int i = 0;
        while(i < k && !pq.isEmpty()){
            Map.Entry<Integer,Integer> curr = pq.poll();
            result[i] = curr.getKey();
            i++;
        }
        return result;

    }
}