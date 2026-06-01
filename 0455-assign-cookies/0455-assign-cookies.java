class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int count = 0;
        int k = 0;
        for(int i = 0; i<n; i++){
            while(k < s.length && s[k] < g[i]){k++;}
            if(k >= s.length) return count;
            count++;
            k++;
        }
        return count;
    }
}