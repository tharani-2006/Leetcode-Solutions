class MyQueue {
    List<Integer> list;

    public MyQueue() {
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(x);  // Add to the end
    }
    
    public int pop() {
        if (list.isEmpty()) {
            return 0;
        }
        return list.remove(0);  // Remove from front
    }
    
    public int peek() {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(0);  // Return front
    }
    
    public boolean empty() {
        return list.isEmpty();
    }
}
