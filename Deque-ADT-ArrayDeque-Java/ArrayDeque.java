package project;

public class ArrayDeque<E> {
private E[] data;  // array for storing elements
    private int f = 0; // index for the front element
    private int r = 0; // index for the rear element (next available slot)
    private int size = 0; // number of elements in deque
    private static final int CAPACITY = 1000; // default capacity

    // Constructor with custom capacity
    public ArrayDeque(int capacity) {
        data = (E[]) new Object[capacity];  // create a new array of given capacity
    }

    // Default constructor
    public ArrayDeque() {
        this(CAPACITY);  // default constructor with capacity 1000
    }

    // Returns the number of elements in the deque
    public int size() {
        return size;
    }

    // Checks if the deque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Checks if the deque is full
    public boolean isFull() {
        return size == data.length;  // deque is full when size equals the length of the array
    }

    // Inserts an element at the front of the deque
    public void addFirst(E e) {
        if (isFull()) throw new IllegalStateException("Deque is full");
        f = (f - 1 + data.length) % data.length;  // circularly decrease f
        data[f] = e;
        size++;
    }

    // Inserts an element at the rear of the deque
    public void addLast(E e) {
        if (isFull()) throw new IllegalStateException("Deque is full");
        data[r] = e;  // place the new element at index r
        r = (r + 1) % data.length;  // circularly increase r (next available slot)
        size++;
    }

    // Removes and returns the front element of the deque
    public E removeFirst() {
        if (isEmpty()) return null;
        E temp = data[f];
        data[f] = null;  // help garbage collection
        f = (f + 1) % data.length;  // circularly increase f (move front forward)
        size--;
        return temp;
    }

    // Removes and returns the rear element of the deque
    public E removeLast() {
        if (isEmpty()) return null;
        r = (r - 1 + data.length) % data.length;  // circularly decrease r (move rear backward)
        E temp = data[r];
        data[r] = null;  // help garbage collection
        size--;
        return temp;
    }

    // Returns the front element without removing it
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    // Returns the rear element without removing it
    public E last() {
        if (isEmpty()) return null;
        int lastIndex = (r - 1 + data.length) % data.length;  // correct index of the last element
        return data[lastIndex];
    }
}
