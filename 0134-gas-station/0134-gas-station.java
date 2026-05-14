class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int curr = 0;
        int index = -1;
        int n = gas.length;
        for(int i = 0; i < n;i++){
            if(curr <= 0){
                curr = 0;
                index = i;
            }
            curr += gas[i] - cost[i];
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;
        return index;
    }
}