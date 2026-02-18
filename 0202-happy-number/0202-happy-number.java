class Solution {
    public int solve(int n){
        int sum = 0;
        while(n != 0){
            int temp = n%10;
            sum += temp * temp;
            n = n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            n = solve(n);
            if(n == 1) return true;
            if(set.contains(n)) return false;
            else set.add(n);
        }
    }
}