public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T item) {
        list.addLast(item);
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        T top = list.getLast();
        list.removeLast();
        return top;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.getLast();
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
        StringBuilder sb = new StringBuilder("MyStack: [");
        for (T item : list) {
            sb.append(item).append(", ");
        }
        if (list.size() > 0) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
