class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        // List<String> list = new ArrayList<>();
        // for(int i = 0; i< arr.length; i++){
        //     if(arr[i].charAt(0) != ' ');
        //         list.add(arr[i]);
        // }
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        String result = String.join(" ", arr);

        return result;
    }
}