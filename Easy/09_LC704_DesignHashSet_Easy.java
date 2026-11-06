// 704. Design Hash Set 

class MyHashSet {
    private static final int SIZE = 1000; 
    private Node[] buckets;

    private static class Node 
    {
        int key;
        Node next;
        Node()
        {
            key=0;
            next=null;
        }
        Node(int key) 
        {
            this.key = key;
            next=null;
        }
    }

    public MyHashSet() {
       buckets = new Node[SIZE];
    }
    
    public void add(int key) {
        int idx = key % SIZE; 

        Node cur = buckets[idx];
        while(cur!=null)
        {
            if(cur.key==key)
                return; 
            cur=cur.next;
        }
        Node newNode = new Node(key);
        newNode.next=buckets[idx];
        buckets[idx]=newNode;
    }
    
    public void remove(int key) {
        int idx = key % SIZE; 

        Node cur = buckets[idx];
        Node prev = null;
        while(cur!=null)
        {
            if(cur.key==key)
            {
                if(prev==null)
                    buckets[idx]=cur.next;
                else
                    prev.next=cur.next;
                return;
            }
            prev=cur;
            cur=cur.next;
        }
    }
    
    public boolean contains(int key) {
        int idx = key % SIZE;
        Node cur = buckets[idx];
        while(cur!=null)
        {
            if(cur.key==key)
                return true;
            cur=cur.next;
        }
        return false; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
