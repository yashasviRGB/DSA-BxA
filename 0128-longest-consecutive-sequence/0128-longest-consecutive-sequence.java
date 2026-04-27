class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            st.add(nums[i]);
        }
        int result = 0;
        // for(int i = 0; i < n; i++){
        //     int curr = nums[i];
        //     int currLen = 0;
        //     if(st.contains(curr - 1)) continue;
        //     else{
        //         while(st.contains(curr)){
        //         currLen++;
        //         result = Math.max(result,currLen);
        //         curr++;
        //     }
        //     }
        // }
        for (int num : st) {
            // start of sequence
            if (!st.contains(num - 1)) {
                int curr = num;
                int currLen = 0;

                while (st.contains(curr)) {
                    currLen++;
                    curr++;
                }

                result = Math.max(result, currLen);
            }
        }
        return result;
    }
}