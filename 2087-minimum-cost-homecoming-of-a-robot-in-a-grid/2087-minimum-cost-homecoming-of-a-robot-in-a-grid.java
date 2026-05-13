class Solution {
    public int solve(int start, int end, int[] arr, boolean flag){
        int sum = 0;
        while(start != end){
            if(flag) start++;
            else start--;
            sum += arr[start];
        }
        // sum += arr[end];
        return sum;
    }
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        boolean down = false;
        boolean right = false;
        if(homePos[1] - startPos[1] >= 0){
            right = true;
        }
        if(homePos[0] - startPos[0] >= 0){
            down = true;
        }
        int colSum = solve(startPos[1], homePos[1], colCosts, right);
        int rowSum = solve(startPos[0], homePos[0], rowCosts, down);
        return rowSum + colSum;


    }
}