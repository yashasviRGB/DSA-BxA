class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = k;
        int i = 0;
        int b = 0;
        int f = 0;
        int max = 0;
        while(i < n){
            if(nums[i] == 1){
                f = i;
                i++;
            }
            else{
                if(l > 0){
                    while(i < n && nums[i] == 0 && l > 0){
                        f = i;
                        i++;
                        l--;
                    }
                }
                else {
                    while(b <= i && nums[b] != 0) b++;
                    b++;
                    f = i;
                    i++;
                }
            }
            max = Math.max(max, f - b + 1);
        }
        return max;
    }
}