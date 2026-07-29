class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        // int[] preMax = new int[n];
        // int[] postMax = new int[n];
        // int curr = 0;

        // for(int i = 0; i< n; i++){
        //     preMax[i] = Math.max(curr,height[i]);
        // }
        // curr = 0;
        // for(int i = n-1; i >= 0; i--){
        //     postMax[i] = Math.max(curr,height[i]);
        // }
        int i = 0;
        int j = n-1;
        int curr = 0;
        int result = 0;
        while(i < j){
            int capacity = Math.min(height[i], height[j]) * (j - i);
            result = Math.max(capacity, result);
            if(height[i] >= height[j]) j--;
            else i++;
        }
        return result;

    }
}