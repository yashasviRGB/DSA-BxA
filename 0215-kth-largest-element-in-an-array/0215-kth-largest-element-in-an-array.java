class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        int i = 0;
        while(i < k){
            pq.offer(nums[i]);
            i++;
        }
        while(i < n){
            int top = pq.peek();
            if(top <= nums[i]){
                pq.poll();
                pq.offer(nums[i]);
            }
            i++;
        }
       
        return pq.peek();
    }
}