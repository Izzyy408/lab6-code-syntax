public class ArrayStack<T> implements Stack<T> {

    private Object[] data;
    private int top;

    public ArrayStack(int capacity) {
        data = new Object[capacity];
        top = 0;
    }

    @Override
    public void push(T element) {
        data[top] = element;
        top++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() {
        top--;
        return (T) data[top];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) data[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }
}