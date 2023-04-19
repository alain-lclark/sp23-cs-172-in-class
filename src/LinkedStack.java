public class LinkedStack<T> {

    private class Node {
        T item;
        Node next;
    }

    private Node top;

    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Push a string in our stack.
     * @param s  the string to be added
     */
    public void push(T s) {
        Node n = new Node();
        n.next = top;
        top = n;
        n.item = s;
    }

    /**
     * Pop the last string that was pushed.
     * @return the last string that was pushed onto the stack
     */
    public T pop() {
        Node oldTop = top;
        top = top.next;
        return oldTop.item;
    }

    public static void main(String[] unused) {
        // A stack of Strings (deduced from context)
        LinkedStack s = new LinkedStack();
        s.push("first");  // the compiler deduces at this stage that we want a stack of Strings
        s.push("second");
        s.pop();
        s.pop();
        if (s.isEmpty()) {
            StdOut.println("My stack is empty");
        }
        else {
            StdOut.println("uhoh, my stack is not empty");
        }

        // A stack of Integers (deduced from context)
        LinkedStack s1 = new LinkedStack();
        s.push(1);  // the compiler deduces at this stage that we want a stack of Integers
        s.push(2);
        s.pop();
        s.pop();
        if (s.isEmpty()) {
            StdOut.println("My stack is empty");
        }
        else {
            StdOut.println("uhoh, my stack is not empty");
        }

        // Explicit declaration of a stack of Doubles
        LinkedStack s2 = new LinkedStack<Double>();
    }

}
