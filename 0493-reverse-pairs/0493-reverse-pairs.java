class Solution {
    int count = 0;
    public int reversePairs(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return count;
    }
    public void countPair(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        while(left <= mid){
            while(right <= high && arr[left] > 2L * arr[right]) right++;
            count += right - (mid + 1);
            left++;
        }
    }
    public void merge(int[] arr, int low, int mid, int high) {
        // Temporary array
        int[] temp = new int[high - low + 1];

        // Starting indices of left and right halves
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Merge elements in sorted order
        while (left <= mid && right <= high) {
            
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        // Copy remaining elements of left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements of right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

    }

    // Merge sort function
    public void mergeSort(int[] arr, int low, int high) {

        if (low < high){
            int mid = (low + high) / 2;
            // Count inversions in left half
            mergeSort(arr, low, mid);
            // Count inversions in right half
            mergeSort(arr, mid + 1, high);
            // Count inversions during merge
            countPair(arr,low,mid,high);
            merge(arr, low, mid, high);
        }
    }
}