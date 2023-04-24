public interface Stack<T> extends Iterable<T> {

    public boolean isEmpty();
    public void push(T item);
    public T pop();

}
