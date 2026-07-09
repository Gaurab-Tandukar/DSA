package queue;

public class Node<T> {
    T data;
    Node<T> next;

    // Optional: constructor for better initialization
    public Node(T data) {
        this.data = data;

    }
}