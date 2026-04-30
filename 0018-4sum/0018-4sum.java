class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        Set<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    // int left = target - (nums[i]+nums[j]+nums[k]);
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long left = (long) target - sum;
                    if(left >= Integer.MIN_VALUE && left <= Integer.MAX_VALUE
                        && set.contains((int)left)){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], (int)left));
                    }
                }
            }
            set.add(nums[i]);
        }
        for(List num: ans){
            result.add(num);
        }
        return result;
    }
}