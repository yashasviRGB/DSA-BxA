class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int n = mat.length;
        int m = mat[0].length;
        int high = m - 1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int colMax = mat[0][mid];
            int colIndex = 0;
            for(int i = 1; i< n; i++){
                // colMax = Math.max(colMax, mat[i][mid]);
                if(colMax < mat[i][mid]){
                    colMax = mat[i][mid];
                    colIndex = i;
                }
            }
            if((mid == m -1 || mat[colIndex][mid] > mat[colIndex][mid + 1]) 
                && (mid == 0 || mat[colIndex][mid] > mat[colIndex][mid - 1])){
                    return new int[] {colIndex, mid};
            }
            else if(mid < m && mat[colIndex][mid] < mat[colIndex][mid + 1]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }
}