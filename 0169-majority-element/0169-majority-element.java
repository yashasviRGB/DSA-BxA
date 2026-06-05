class Solution {
    public int majorityElement(int[] nums) {
        int cand = -1;
        int vote = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(vote == 0){
                cand = nums[i];
                vote++;
            }
            else if(nums[i] != cand){
                vote--;
            }
            else{
                vote++;
            }
        }
        int count = 0;
        for(int i = 0; i< n; i++){
            if(nums[i] == cand) count++;
        }
        boolean check = count >= n/2;
        if(check) return cand;
        return -1;
    }
}