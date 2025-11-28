package Queue;

import java.util.*;

public class CircularQbyArray {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add element to the queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("QUEUE IS FULL");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove element from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                // Only one element was present
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek at the front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5); // This will fill the queue

        // Try adding one more to test overflow
        q.add(6); // Should print "QUEUE IS FULL"

        // Remove and print elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        // Try removing from empty queue
        q.remove(); // Should print "Queue is empty"
    }
}