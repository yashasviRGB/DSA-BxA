class Solution {

    public void setZeroes(int[][] matrix){
        Set<Integer> rows = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    col.add(j);
                }
            }
        }
        for(int i : rows){
            for(int j = 0; j< n; j++){
                matrix[i][j] = 0;
            }
        }
        for(int j : col){
            for(int i = 0; i< m; i++){
                matrix[i][j] = 0;
            }
        }
        // return matrix;
    }
    // public void setZeroes(int[][] matrix){
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     boolean firstRowHasZero = false;
    //     boolean firstColHasZero = false;
    //     for (int c = 0; c < n; c++) {
    //         if (matrix[0][c] == 0) {
    //             firstRowHasZero = true;
    //             break;
    //         }
    //     }

    //     // Check if the first column contains zero
    //     for (int r = 0; r < m; r++) {
    //         if (matrix[r][0] == 0) {
    //             firstColHasZero = true;
    //             break;
    //         }
    //     }
    //     for(int i = 0; i< m ; i++){
    //         for(int j = 0; j < n; j++){
    //             if(matrix[i][j] == 0){
    //                 matrix[0][j] = 0;
    //                 matrix[i][0] = 0;
    //             }
    //         }
    //     }
    //     for(int j = 1; j< n; j++){
    //         if(matrix[0][j] == 0){
    //             for(int i = 1; i < m; i++){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    //     for(int i = 1; i< m; i++){
    //         if(matrix[i][0] == 0){
    //             for(int j = 1; j < n; j++){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    //     if (firstRowHasZero) {
    //         for (int c = 0; c < n; c++) {
    //             matrix[0][c] = 0;
    //         }
    //     }

    //     // Set the first column to zero if needed
    //     if (firstColHasZero) {
    //         for (int r = 0; r < m; r++) {
    //             matrix[r][0] = 0;
    //         }
    //     }   
    // }

    // // public void setZeroes(int[][] matrix) {
    // //     Set<Integer> col = new HashSet<>();
    // //     Set<Integer> row = new HashSet<>();
    // //     int m = matrix.length;
    // //     int n = matrix[0].length;

    // //     for(int i = 0; i< m ; i++){
    // //         for(int j = 0; j < n; j++){
    // //             if(matrix[i][j] == 0){
    // //                 row.add(i);
    // //                 col.add(j);
    // //             }
    // //         }
    // //     }
        
    // //     for(Integer i : row){
    // //         for(int j = 0; j < n; j++)
    // //             matrix[i][j] = 0;
    // //     }
    // //     for(Integer j : col){
    // //         for(int i = 0; i < m; i++)
    // //             matrix[i][j] = 0;
    // //     }
    // // }
}