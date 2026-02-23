class Solution {
    public List<String> summaryRanges(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<String> result = new ArrayList<>();
        int n = nums.length;
        if(n == 0) return result;
        int start = nums[0];
        int end;

        for(int i = 1; i< n; i++){
            if(nums[i-1] + 1 == nums[i]){
                continue;
            }
            else{
                end = nums[i-1];
                result.add(start == end ? String.valueOf(start) : 
                start + "->" + end);
                start = nums[i];
            }
        }
        end = nums[n-1];
        result.add(start == end ? String.valueOf(start) : 
                start + "->" + end);


        // for(int i = 0; i< n; i++){
        //     set.add(nums[i]);
        // }
        // int start;
        // int end;
        // // int i = 0;

        // while(start != n-1){

        // }

        // for(int i = 0; i < n; i++){
        //     int x = nums[i];
        //     if(!set.contains(x-1)){
        //         start = x;
        //         while(set.contains(x+1)){
        //             set.remove(x);
        //             // len++;
        //             // longest = Math.max(len,longest);
        //             x++;
        //             i++;
        //         }
        //         set.remove(x);
        //         end = x;
        //         result.add(start == end ? String.valueOf(start) : 
        //         start + "->" + end);
        //     }
            
        // }
        return result;
    }
}