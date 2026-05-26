class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}

// class Solution {
//     public String reverseWords(String s) {
//         String x = s.trim();
//         StringBuilder st = new StringBuilder();
        
//         int start = 0;
//         int end = 0;
//         int n = x.length();
//         for(int i = 1; i<n; i++){
//             end = i;
//             if(x.charAt(end) == ' ' && x.charAt(start) != ' '){
//                 st.append(x.substring(start,end));
//                 st.append(" ");
//                 start = end;
//             }
//             else if(x.charAt(end) != ' ' && x.charAt(start) == ' '){
//                 start = end;
//             }
//         }
//         st.append(x.substring(start,end+1));
//         String[] arr = st.toString().split(" ");

//         int low = 0;
//         int high = arr.length -1;
//         while(low < high){
//             String temp = arr[low];
//             arr[low] = arr[high];
//             arr[high] = temp;
//             low++;
//             high--;
//         }
//         String result = String.join(" ", arr);
//         return result;

//     }
// }