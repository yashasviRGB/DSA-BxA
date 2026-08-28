class TimeMap {
    HashMap<String, Stack<Pair>> mp;

    public class Pair{
        public int time;
        public String value;

        public Pair(int time, String value){
            this.time = time;
            this.value = value;
        }
    }

    public TimeMap() {
        mp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        mp.putIfAbsent(key, new Stack<>());
        mp.get(key).push(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!mp.containsKey(key)) return "";
        Stack<Pair> st = mp.get(key);
        
        int low = 0;
        int high = st.size() - 1;
        String result = "";
        while(low <= high){
            int mid = (low + high)/2;
            if(st.get(mid).time <= timestamp){
                result = st.get(mid).value;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */