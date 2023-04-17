public class ArrayStackOfStrings {

    private String[] stack;
    private int n;

    public ArrayStackOfStrings(int size) {
        stack = new String[size];
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
    public void push(String s) {
        stack[n++] = s;
    }

    /**
     * Pop the last string that was pushed.
     * @return the last string that was pushed onto the stack
     */
    public String pop() {
        return stack[--n];
    }

    public static void main(String[] unused) {
        ArrayStackOfStrings s = new ArrayStackOfStrings(10);
        s.push("first");
        s.push("second");
        s.pop();
        s.pop();
        if (s.isEmpty()) {
            StdOut.println("My stack is empty");
        }
        else {
            StdOut.println("uhoh, my stack is not empty");
        }
    }
}
