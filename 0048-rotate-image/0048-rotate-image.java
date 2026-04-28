class Solution {
    public void swap1(int i , int j, int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void swap1(int i , int j, int[] matrix){
        int temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }
    public void reverse(int i , int j, int[] arr){
        while(i<j){
            swap1(i,j,arr);
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                swap1(i, j, matrix);
            }
        }
        for(int i = 0; i < n; i++){
            reverse(0,n-1, matrix[i]);
        }
    }
}