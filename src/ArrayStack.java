public class ArrayStack<T> {
    private T[] stack;
    private int n;

    public ArrayStack(int size) {
        stack = (T[])new Object[size];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return n == stack.length;
    }

    /**
     * Push a string in our stack.
     * @param s  the string to be added
     */
    public void push(T s) {
        stack[n++] = s;
    }

    /**
     * Pop the last string that was pushed.
     * @return the last string that was pushed onto the stack
     */
    public T pop() {
        return stack[--n];
    }

    public static void main(String[] unused) {
        // A stack of Strings (deduced from context)
        ArrayStack s = new ArrayStack(10);
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
        ArrayStack s1 = new ArrayStack(10);
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
        ArrayStack s2 = new ArrayStack<Double>(10);
    }

}
