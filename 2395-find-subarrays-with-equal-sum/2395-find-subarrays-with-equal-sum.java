class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer, Set<Integer>> mp = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i< n-1; i++){
            int sum = nums[i] + nums[i+1];
            mp.computeIfAbsent(sum, k -> new HashSet<>()).add(i);
        }
        for(Set<Integer> s : mp.values()){
            if(s.size() > 1) return true;
        }
        return false;
    }
}