public class Complex {
    double real;
    double imaginary;

    public Complex(double re, double im) {
        real = re;
        imaginary = im;
    }

    public Complex() {
        real = 0.;
        imaginary = 0.;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setReal(double re) {
        this.real = re;
    }

    public Complex plus(Complex b) {
        Complex a = this;
        Complex sum = new Complex(a.real + b.real, a.imaginary + b.imaginary);
        return sum;
        // return new Complex(this.real + b.real, this.imaginary + b.imaginary); // one line version
    }

    public Complex minus(Complex b) {
        return new Complex(this.real - b.real, this.imaginary - b.imaginary);
    }

    public Complex times(Complex b) {
        Complex a = this;
        double re = a.real * b.real - a.imaginary * b.imaginary;
        double im = a.real * b.imaginary + a.imaginary * b.real;
        return new Complex(re, im);
    }

    public String toString() {
        return "(" + this.real + ", " + this.imaginary + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return complex.real == this.real && complex.imaginary == this.imaginary;
    }

}
