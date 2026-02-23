class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        if(n == 0) return 0;
        for(int i = 0; i< n; i++){
            set.add(nums[i]);
        }
        int len = 1;
        int longest = 1;
        // int i = 0;

        for(int i = 0; i < n; i++){
            int x = nums[i];
            if(!set.contains(x-1)){
                len = 1;
                while(set.contains(x+1)){
                    set.remove(x);
                    len++;
                    longest = Math.max(len,longest);
                    x++;
                }
            }
        }
        return longest;
    }
}