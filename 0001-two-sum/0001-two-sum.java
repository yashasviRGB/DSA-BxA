class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                int index = map.get(diff);
                arr[0] = index;
                arr[1] = i; 
                return arr;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}