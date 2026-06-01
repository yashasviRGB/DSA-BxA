class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> next = new ArrayList<>();

        next.add(1);
        
        result.add(new ArrayList<>(next));
        if(numRows == 1) return result;

        next.add(1);

        result.add(new ArrayList<>(next));
        if(numRows == 2) return result;

        List<Integer> prev;
        for(int i = 2; i< numRows; i++){
            // List<Integer> temp;
            prev = new ArrayList<>(next);
            next = new ArrayList<>();
            next.add(1);
            for(int j = 1; j < prev.size(); j++){
                next.add(prev.get(j) + prev.get(j-1));
            }
            next.add(1);
            
            result.add(new ArrayList<>(next));
        }
        return result;








    }
    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> prev = new ArrayList<>();
    //     List<Integer> curr = new ArrayList<>();
    //     curr.add(1);
    //     result.add(new ArrayList<>(curr));
    //     if(numRows == 1) return result;
    //     curr.add(1);
    //     result.add(new ArrayList<>(curr));
    //     // prev = curr;
    //     for(int i = 2; i < numRows; i++){
    //         // prev.addAll(curr); // Wrong: prev keeps growing every iteration
    //         prev = new ArrayList<>(curr);
    //         curr = new ArrayList<>();        // fix: reset current row
    //         curr.add(1);
    //         for(int j = 1; j < i; j++){
    //             int sum = prev.get(j) + prev.get(j-1);
    //             curr.add(sum);
                
    //         }
    //         curr.add(1);
    //         result.add(new ArrayList<>(curr));
    //     }
    //     return result;
    // }
}