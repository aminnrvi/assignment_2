public class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void insert(T item) {
        heap.addLast(item);
        heapifyUp(heap.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) throw new RuntimeException("Heap is empty");
        T min = heap.get(0);
        T last = heap.getLast();
        heap.set(0, last);
        heap.removeLast();
        heapifyDown(0);
        return min;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Heap is empty");
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }

    public void clear() {
        heap.clear();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        int left, right, smallest;
        while (index < heap.size()) {
            left = 2 * index + 1;
            right = 2 * index + 2;
            smallest = index;

            if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0) smallest = left;
            if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0) smallest = right;

            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyMinHeap: [");
        for (T item : heap) {
            sb.append(item).append(", ");
        }
        if (heap.size() > 0) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
