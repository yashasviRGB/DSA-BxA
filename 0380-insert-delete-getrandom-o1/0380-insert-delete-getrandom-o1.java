class RandomizedSet {
    Set<Integer> set = new HashSet<>();
    int size = 0;

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        boolean status = set.add(val);
        if(status) size++;
        return status;
    }
    
    public boolean remove(int val) {
        boolean status = set.remove(val);
        if(status) size--;
        return status;
    }
    
    public int getRandom() {
        Random rand = new Random();
        if(size == 0) return 0;
        int n = rand.nextInt(size) + 1;
        int count = 0;
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            Integer value = it.next();
            count++;
            if(count == n) return value;
            // System.out.println(value);
        }
        return 0;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */