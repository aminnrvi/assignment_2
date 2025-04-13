public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        T front = list.getFirst();
        list.removeFirst();
        return front;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyQueue: [");
        for (T item : list) {
            sb.append(item).append(", ");
        }
        if (list.size() > 0) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
