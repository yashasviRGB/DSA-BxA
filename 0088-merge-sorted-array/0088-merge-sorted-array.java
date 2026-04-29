class Solution {
    public void swap(int i, int j, int[] arr1, int[] arr2){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
    public void position(int j, int[] arr2){
        int n = arr2.length;
        while(j < n-1 && arr2[j] > arr2[j+1]){
            int temp = arr2[j];
            arr2[j] = arr2[j+1];
            arr2[j+1] = temp;
            j++;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        // int k = 0;
        // int[] result = new int[n+m];
        while(i<m && j<n){
            if(nums1[i] > nums2[j]){
                // result[k] = nums1[i];
                swap(i,j,nums1,nums2);
                i++;
                position(j,nums2);
            }
            else{
                // result[k] = nums2[j];
                i++;
            }
            // k++;
        }
        j = 0;
        while( i < (m + n) && j < n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        // while(j<n){
        //     result[k++] = nums2[j++];
        // }
        // for(i = 0; i < m+n; i++){
        //     nums1[i] = result[i];
        // }
    }
}