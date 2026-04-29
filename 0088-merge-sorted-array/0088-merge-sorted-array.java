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
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i = 0;
    //     int j = 0;

    //     while(i<m && j<n){
    //         if(nums1[i] > nums2[j]){
    //             swap(i,j,nums1,nums2);
    //             i++;
    //             position(j,nums2);
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     j = 0;
    //     while( i < (m + n) && j < n){
    //         nums1[i] = nums2[j];
    //         i++;
    //         j++;
    //     }
    // }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                // int temp = nums1[k];
                nums1[k] = nums1[i];
                // nums1[i] = temp;
                i--;
                k--;
            }
            else{
                // int temp = nums1[k];
                nums1[k] = nums2[j];
                // nums2[j] = temp;
                j--;
                k--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}