class Solution {
    public int findRow(int[][] matrix, int target){
        int n = matrix.length;
        int low = 0;
        // int index = -1;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[mid][0] == target) return mid;
            else if(matrix[mid][0] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high;
    }
    public int findElement(int[][] matrix, int target, int index){
        int n = matrix[0].length;
        int low = 0;
        // int result = -1;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[index][mid] == target){
                // result = mid;
                return mid;
            }
            else if(matrix[index][mid] < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = findRow(matrix,target);
        int result = -1;
        if(index < 0) result = findElement(matrix,target,0);
        else result = findElement(matrix,target,index);
        
        return result >= 0 ? true : false;
    }
}