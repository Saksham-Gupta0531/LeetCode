// Last updated: 7/31/2025, 12:29:02 PM
class MyHashSet {
private boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1_000_001]; 
    }

    public void add(int key) {
        storage[key] = true; 
    }

    public void remove(int key) {
        storage[key] = false; 
    }

    public boolean contains(int key) {
        return storage[key]; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */