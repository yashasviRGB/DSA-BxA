class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int n = arr.length;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            int missing = arr[mid] -mid - 1;
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
            
        }
        if(high <0) return k;
        int missing = arr[high] - high - 1;
        int result = arr[high] + k - missing;

        return result;
    }
}