class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n+1];

        for(int i = 0; i< n ; i++){
            int index = citations[i] > n-1 ? n : citations[i];
            bucket[index]++;
        }
        int sum = 0;
        for(int i = n; i>=0; i--){
            sum += bucket[i];
            if(sum >= i) return i;
        }
        return 0;
    }
}