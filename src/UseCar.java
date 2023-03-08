public class UseCar {

    public static void main(String[] unused) {
        Car c = new Car();
        StdOut.print("Enter a make: ");
        c.make = StdIn.readString();
        StdOut.print("Enter a model: ");
        c.model = StdIn.readString();
        StdOut.print("Enter a year: ");
        c.year = StdIn.readInt();
        StdOut.println("The car you defined:");
        StdOut.println("\tmake = " + c.make);
        StdOut.println("\tmodel = " + c.model);
        StdOut.println("\tyear = " + c.year);
    }
}
