class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int result = 0;
        int n = nums.length;
        mp.put(0,1);
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(mp.containsKey(sum - k )){
                result += mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum, 0) + 1);
        }
        return result;

    }
}