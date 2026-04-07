class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int total = 1;
        int countZero = 0;
        int indexofzero = -1;
        int[] arr = new int[n];
        if(n == 0) return arr;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                countZero++;
                indexofzero = i;
            }else{
                total *= nums[i];
            }
        }
        if(countZero > 1) return arr;
        for(int i = 0; i< n; i++){
            if(countZero == 1){
                arr[indexofzero] = total;
                return arr;
            }
            arr[i] = total / nums[i];
        }
        return arr;
    }
}