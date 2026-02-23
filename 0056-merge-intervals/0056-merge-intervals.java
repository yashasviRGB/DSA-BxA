class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> result = new ArrayList<>();

        int n = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < n; i++){
            int next = intervals[i][0];
            if(next <= end){
                end = Math.max(intervals[i][1],end);
            }
            else{
                result.add(Arrays.asList(start, end));
                start = next;
                end = intervals[i][1];
            }
        }
        result.add(Arrays.asList(start, end));
        // convert List<List<Integer>> to int[][]
        int[][] ans = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }

        return ans;
    }
}