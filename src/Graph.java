public class Graph {

    /**
     * Plot the function x^2 in the interval [a, b] using n + 1 spaced points.
     */
    public static void plotX2(double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a)/n;
        for (int i = 0; i <= n; ++i) {
            double x = a + i*delta;
            y[i] = x * x;
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    /**
     * Plot the function |x| in the interval [a, b] using n + 1 spaced points.
     */
    public static void plotAbsoluteX(double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a)/n;
        for (int i = 0; i <= n; ++i) {
            double x = a + i*delta;
            y[i] = Math.abs(x);
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    /**
     * Plot the function f in the interval [a, b] using n + 1 spaced points.
     */
    public static void plot(UnivariateFunction f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a)/n;
        for (int i = 0; i <= n; ++i) {
            double x = a + i*delta;
            y[i] = f.eval(x);
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static void main(String[] unused) {
        // Plotting with special-purpose functions.
        //plotX2(-0.6, 0.6, 50);
        //plotAbsoluteX(-0.6, 0.6, 50);

        // Plotting with a functional interface.
        // First with an explicit function creation.
        //UnivariateFunction s = new Square();
        //UnivariateFunction a = new Absolute();
        //plot(s, -0.6, 0.6, 50);
        //plot(a, -0.6, 0.6, 50);

        // Second with lambda functions.
        plot(x -> x * x, -0.6, 0.6, 50);
        plot(x1 -> Math.abs(x1), -0.6, 0.6, 50);
        plot(x1 -> x1 * x1 * x1 + 0.1, -0.6, 0.6, 50);

    }
}
