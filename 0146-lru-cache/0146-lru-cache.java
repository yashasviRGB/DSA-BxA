class LRUCache {
    int capacity;
    Map<Integer, Node> mp = new HashMap<>();;
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key,int val){
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
        
    }
    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    void deleteCurr(Node curr){
        Node prevNode = curr.prev;
        Node nextNode = curr.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    void insert(Node curr){
        Node temp = head.next;
        curr.next = temp;
        temp.prev = curr;
        head.next = curr;
        curr.prev = head;
    }
    public int get(int key) {
        if(mp.containsKey(key)){
            Node curr = mp.get(key);
            deleteCurr(curr);
            insert(curr);
            return curr.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node curr = mp.get(key);
            curr.val = value;
            deleteCurr(curr);
            insert(curr);
        }
        else if(mp.size() == capacity){
            Node curr = tail.prev;
            mp.remove(curr.key);
            deleteCurr(curr);
            curr.key = key;
            curr.val = value;
            insert(curr);
            mp.put(key,curr);
        }
        else{
            Node curr = new Node(key,value);
            insert(curr);
            mp.put(key,curr);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */