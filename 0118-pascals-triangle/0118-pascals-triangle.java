class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;
        
        if(numRows == 1){
            result.add(Arrays.asList(1));
            return result;
        }
        List<List<Integer>> prev = generate(numRows - 1);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        for(int i = 1; i < numRows- 1; i++){
            currRow.add(prev.get(numRows - 2).get(i - 1) 
                        + prev.get(numRows - 2).get(i));
        }
        currRow.add(1);
        prev.add(currRow);
        return prev;
    }

    // public List<List<Integer>> generate(int numRows) {

    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> curr = new ArrayList<>();

    //     curr.add(1);
        
    //     result.add(new ArrayList<>(curr));
    //     if(numRows == 1) return result;

    //     curr.add(1);

    //     result.add(new ArrayList<>(curr));
    //     if(numRows == 2) return result;

    //     List<Integer> prev;
    //     for(int i = 2; i< numRows; i++){
    //         // List<Integer> temp;
    //         prev = new ArrayList<>(curr);
    //         curr = new ArrayList<>();
    //         curr.add(1);
    //         for(int j = 1; j < prev.size(); j++){
    //             curr.add(prev.get(j) + prev.get(j-1));
    //         }
    //         curr.add(1);
            
    //         result.add(new ArrayList<>(curr));
    //     }
    //     return result;
    // }



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