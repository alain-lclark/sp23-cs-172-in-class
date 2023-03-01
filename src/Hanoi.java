public class Hanoi {

    public static void move(int n, char from, char to, char helper) {
        if (n == 1) {
            StdOut.println("Move top disk from peg " + from + " to peg " + to);
        }
        else {
            move(n - 1, from, helper, to);
            move(1, from, to, helper);
            move(n - 1, helper, to, from);
        }
    }

    public static void main(String[] unused) {
        move(4, 'A', 'B', 'C');
    }

}
