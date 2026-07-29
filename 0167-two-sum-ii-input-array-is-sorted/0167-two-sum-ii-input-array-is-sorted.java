class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int front = 0;
        int[] result = new int[2];
        int back = n - 1;
        // while(back >= 0 && numbers[back] > target) back--;
        while(front < back){
            int sum = numbers[front] + numbers[back];

            if(sum == target){
                result[0] = front + 1;
                result[1] = back + 1;
                return result;
            }
            else if(sum < target){
                front++;
            }
            else{
                back--;
            }
        }
        return result;
    }
}