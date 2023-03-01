public class Fibonacci {

    public static long[] cache = new long[92];
    public static long fib(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (cache[(int)n] > 0) return cache[(int)n];
        cache[(int)n] = fib(n - 1) + fib(n - 2);
        return cache[(int)n];
    }

    public static void main(String[] unused) {
        for (int n = 0; n < 10; ++n) {
            StdOut.println("Fibonacci of " + n + " is " + fib(n));
        }
        StdOut.println("fib(53) = ...");
        StdOut.println(fib(53));
        StdOut.println("fib(70) = ...");
        StdOut.println(fib(70));
    }
}
