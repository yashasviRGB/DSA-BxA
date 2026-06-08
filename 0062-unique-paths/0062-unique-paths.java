class Solution {
    int row;
    int col;
    int[][] dp;
    public int solve(int i, int j){
        if(i> row || j > col) return -1;
        if(i == row && j == col) return 1;
        if(dp[i][j] > 0) return dp[i][j];

        int right = solve(i,j + 1);
        int bottom = solve(i + 1,j);
        if(bottom != -1 && right != -1){
            dp[i][j] = bottom + right;
        }
        else if(bottom == -1 && right != -1){
            dp[i][j] = right;
        }
        else if(bottom != -1 && right == -1){
            dp[i][j] = bottom;
        }
        return dp[i][j];
        
    }
    public int uniquePaths(int m, int n) {
        this.row = m;
        this.col = n;
        dp = new int[m+1][n+1];
        return solve(1,1);
    }
}





/*
if(i >= row || j >= col){
            return -1;
        }
        if(i == row - 1 && j == col - 1){
            return 1;
        }
        if(dp[i][j] != 0) return dp[i][j];
        int bottom = solve(i + 1, j);
        int right = solve(i, j + 1);
        if(bottom != -1 && right != -1){
            dp[i][j] = bottom + right;
        }
        else if(bottom == -1 && right != -1){
            dp[i][j] = right;
        }
        else if(bottom != -1 && right == -1){
            dp[i][j] = bottom;
        }
        return dp[i][j];




        this.row = m;
        this.col = n;
        dp = new int[m][n];   // ✅ initialize here

        // initialize dp with -1
        // for(int i = 0; i < m; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        return solve(0,0);

 */