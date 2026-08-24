class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        
        List<List<Integer>> result = new ArrayList<>();
        while(i < n){
            if (i > 0 && nums[i] == nums[i-1]) {
                i++;
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                }
                if(sum > 0){
                    k--;
                }
                if(sum < 0){
                    j++;
                }
            }
            i++;
        }
        return result;
    }
}