package queue;

public class MyQueue<T> {
    Node<T> front;
    Node<T> rear;

    public void enqueue(T data) {
        Node<T> node = new Node<>(data);

        if(rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public T dequeue() {

        if (front == null) {
            return null;
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return data;
    }

    public String display() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<h1>Waiting List<h1>");
        Node<T> temp = front;

        while(temp != null) {
            stringBuilder.append(temp.data.toString());
            temp = temp.next;
        }
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }
}
