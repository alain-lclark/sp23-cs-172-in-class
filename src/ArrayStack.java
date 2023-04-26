import java.util.Iterator;

public class ArrayStack<T> implements Stack<T> {
    private T[] stack;
    private int n;

    public ArrayStack() {
        stack = (T[])new Object[1];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    private void resize(int capacity) {
        T[] data = (T[])new Object[capacity];
        for (int i = 0; i < n; ++i) {
            data[i] = stack[i];
        }
        stack = data;
    }

    /**
     * Push a string in our stack.
     * @param s  the string to be added
     */
    public void push(T s) {
        if (n >= stack.length) resize(2*n);
        assert n < stack.length;
        stack[n++] = s;
    }

    /**
     * Pop the last string that was pushed.
     * @return the last string that was pushed onto the stack
     */
    public T pop() {
        T s = stack[n - 1];
        stack[n - 1] = null;  // avoid loitering
        n--;
        if (n > 0 && n == stack.length/4) resize(stack.length/2);
        return s;
    }

    public static void main(String[] unused) {
        // A stack of Strings (deduced from context)
        ArrayStack s = new ArrayStack();
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
        ArrayStack s1 = new ArrayStack();
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
        // We can only use a "reference" type as a parameter to a generic type
        // In particular, a primitive type (e.g., double) cannot be used that way
        // Luckily, all primitive types have their corresponding wrapper types, e.g.,
        // double ==> Double, boolean ==> Boolean, char ==> Character, int ==> Integer
        ArrayStack s2 = new ArrayStack<Integer>();
        Integer i = 2;  // Wrapper type initialized with a int literal (Java auto-wraps the int in an object)
        int i1 = i;     // Access the content of wrapper (Java calls the getter, .intValue(), auto-magically)
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
