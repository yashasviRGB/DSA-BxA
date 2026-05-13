class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> mp = new HashSet<>();

        int n = nums.length;
        for(int i = 0; i< n-1; i++){
            int sum = nums[i] + nums[i+1];
            if(mp.contains(sum)) return true;
            else mp.add(sum);
            // mp.computeIfAbsent(sum, k -> new HashSet<>()).add(i);
        }
        // for(Set<Integer> s : mp.values()){
        //     if(s.size() > 1) return true;
        // }
        return false;
    }
}