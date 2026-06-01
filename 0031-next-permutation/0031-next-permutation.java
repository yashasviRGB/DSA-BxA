class Solution {
    public void swap(int a , int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void reverse(int i, int j , int[] arr){
        while(i < j){
            swap(i, j, arr);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        int swapping = Integer.MAX_VALUE;
        int index = -1;
        if(pivot == -1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i = n - 1; i >= pivot + 1; i--){
            if(nums[i] > nums[pivot] && nums[i] < swapping){
                index = i;
                swapping = nums[i];
                swap(pivot,i,nums);
                break;
            }
        }
        reverse(pivot + 1,n-1,nums);

    }




    /*
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        // Step 2: if no pivot → reverse whole array
        if(pivot == -1){
            reverse(0, n - 1, nums);
            return;
        }

        // Step 3: find next greater element from right
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                swap(i, pivot, nums);
                break;
            }
        }

        // Step 4: reverse suffix
        reverse(pivot + 1, n - 1, nums);
    }
    */



}