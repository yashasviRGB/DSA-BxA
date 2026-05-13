class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        //second pair, index
        int n = nums.length;
        int[] result = new int[2];
        for(int i = 0; i < n;i++){
            int rem = target - nums[i];
            if(mp.containsKey(rem)){
                result[0] = mp.get(rem);
                result[1] = i;
                return result;
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return result;
    }
}