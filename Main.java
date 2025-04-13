public class Main {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
        testMyStack();
        testMyQueue();
        testMyMinHeap();
    }

    private static void testMyArrayList() {
        System.out.println("🔹 Testing MyArrayList");
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.addFirst(0);
        list.addLast(3);
        System.out.println(list);
        list.remove(1);
        System.out.println("After remove index 1: " + list);
    }

    private static void testMyLinkedList() {
        System.out.println("🔹 Testing MyLinkedList");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.addFirst("start");
        list.addLast("end");
        System.out.println(list);
        list.removeLast();
        System.out.println("After removing last: " + list);
    }

    private static void testMyStack() {
        System.out.println("🔹 Testing MyStack");
        MyStack<String> stack = new MyStack<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack);
    }

    private static void testMyQueue() {
        System.out.println("🔹 Testing MyQueue");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println(queue);
    }

    private static void testMyMinHeap() {
        System.out.println("🔹 Testing MyMinHeap");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(7);
        heap.insert(1);
        System.out.println("Min: " + heap.peek());
        System.out.println("Extracted Min: " + heap.extractMin());
        System.out.println(heap);
    }
}