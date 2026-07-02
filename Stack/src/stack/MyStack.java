package stack;

@SuppressWarnings("unchecked")
public class MyStack<T> {
    Object[] data;
    int top;

    public MyStack() {
        data = new Object[10];
        top = -1;
    }

    public void push(T element) {
        if (top == data.length - 1) {
            grow();
        }
        top++;

        data[top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T element = (T)data[top];
            data[top] = null;
            top--;
            return element;
        }
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }

        else {
            T element = (T)data[top];
            return element;
        }
    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        data = new Object[10];
        top = -1;
    }

    private void grow() {
        Object[] newData = new Object[data.length*2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

}
