class Solution {
    //[0][1] greater than [1][0]
    //[i-1][1] greater than [i][0]
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int i = 0;
        int start = intervals[i][0];
        int end = intervals[i][1];
        List<List<Integer>> result = new ArrayList<>();
        
        i++;
        while(i < n){

            if(end >= intervals[i][0]){
                end = Math.max(intervals[i][1],end);
            }
            else{
                result.add(Arrays.asList(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
            i++;
        }
        // end = Math.max(end,intervals[n-1][1]);
        result.add(Arrays.asList(start, end));
        int[][] ans = new int[result.size()][2];
        for(i = 0; i < result.size(); i++){
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }
        return ans;
    }
}