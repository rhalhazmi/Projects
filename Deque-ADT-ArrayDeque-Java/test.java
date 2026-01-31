
package project;

public class test {
    public static void main(String[] args) {
        // Create a Deque with a capacity of 5
        ArrayDeque<Integer> deque = new ArrayDeque<>(5);

        // Test isEmpty() and size()
        System.out.println("Initial Deque empty? " + deque.isEmpty());  // true
        System.out.println("Initial size: " + deque.size());  // 0

        // Add elements to the front
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        System.out.println("Deque after adding to the front: ");
        System.out.println("First element: " + deque.first());  // 30
        System.out.println("Last element: " + deque.last());  // 10
        System.out.println("Size: " + deque.size());  // 3

        // Add elements to the rear
        deque.addLast(40);
        deque.addLast(50);
        
        System.out.println("Deque after adding to the rear: ");
        System.out.println("First element: " + deque.first());  // 30
        System.out.println("Last element: " + deque.last());  // 50
        System.out.println("Size: " + deque.size());  // 5

        // Try adding to a full deque (will throw exception)
        try {
            deque.addLast(60);  // should throw exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());  // Deque is full
        }

        // Remove elements from the front
        System.out.println("Removing first: " + deque.removeFirst());  // 30
        System.out.println("Removing first: " + deque.removeFirst());  // 20

        // Remove elements from the rear
        System.out.println("Removing last: " + deque.removeLast());  // 50
        System.out.println("Removing last: " + deque.removeLast());  // 40

        // Check the deque status
        System.out.println("Deque empty? " + deque.isEmpty());  // false (1 element remaining)
        System.out.println("First element: " + deque.first());  // 10
        System.out.println("Last element: " + deque.last());  // 10
        System.out.println("Size: " + deque.size());  // 1

        // Remove the last element
        System.out.println("Removing last: " + deque.removeLast());  // 10
        System.out.println("Deque empty? " + deque.isEmpty());  // true

        // Try removing from an empty deque
        System.out.println("Removing first from empty deque: " + deque.removeFirst());  // null
        System.out.println("Removing last from empty deque: " + deque.removeLast());  // null
    }
}
