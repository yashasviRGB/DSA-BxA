class Solution {

    public int check(int[] bloomDay, int m, int window, int value){
        int n = bloomDay.length;
        int numFlowers = 0;
        int bou = 0;
        for(int num: bloomDay){
            if(num <= value){
                numFlowers++;
                if(numFlowers == window){
                    bou++;
                    numFlowers = 0;
                }
            }
            else{
                numFlowers = 0;
            }
        }
        
            
        return bou;
    }

    public int minDays(int[] bloomDay, int m, int window) {
        int n = bloomDay.length;

        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int num : bloomDay){
            high = Math.max(high, num);
        }
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int count = check(bloomDay,m, window, mid);
            if(count >= m){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
}