public class UseComplex {
    static Complex createComplex(double r, double i) {
        Complex c = new Complex();
        c.real = r;
        c.imaginary = i;
        return c;
    }

    static double add(double a, double b) {
        double result;
        result = a + b;
        return result;
    }
    static Complex add(Complex a, Complex b) {
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }

    static String toString(Complex c) {
        return "(" + c.real + ", " + c.imaginary + ")";
    }

    public static void main(String[] unused) {
        Complex c = createComplex(1., 1.);
        StdOut.println("c = " + toString(c));
        Complex c1 = createComplex(-1, 3.5);
        Complex c2 = add(c, c1);
        StdOut.println("c2 = " + toString(c2));
        StdOut.println(c);
        StdOut.println(c1);
        StdOut.println(c2);

        Complex[] v = new Complex[4];
        v[0] = null;
        v[1] = null;
        v[2] = null;
        v[3] = null;
        for (int i = 0; i < v.length; ++i) {
            v[i] = createComplex(StdRandom.gaussian(), StdRandom.gaussian());
        }
        for (int i = 0; i < v.length; ++i) {
            StdOut.println(toString(v[i]));
        }
    }
}
