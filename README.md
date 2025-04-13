# Custom Java Data Structures

This project implements several custom data structures in Java **without using java.util.* (except Iterator)**.

##  Implemented Structures

###  Physical Structures
- `MyArrayList<T>` — Custom resizable array
- `MyLinkedList<T>` — Custom doubly linked list

###  Logical Structures
- `MyStack<T>` — LIFO Stack (based on `MyArrayList`)
- `MyQueue<T>` — FIFO Queue (based on `MyLinkedList`)
- `MyMinHeap<T extends Comparable<T>>` — Binary Min-Heap (based on `MyArrayList`)

##  Testing

Run the `Main` class to test all functionality:
```bash
javac *.java
java Main
