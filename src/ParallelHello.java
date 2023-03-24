/**
 * ParallelHello is an example of use of Implementation Inheritance.
 *
 * ParallelHello inherits from the state and behaviors of another class
 * called Thread.  This class gives a programmer the opportunity to
 * express concurrent activities, that is, activities mostly independent
 * of each other.  A common way to refer to such an activity in computer
 * science is thread.
 */
public class ParallelHello extends Thread {

    private int id;

    public ParallelHello(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        StdOut.println("Hello from thread " + id + "!");
    }

    public static void main(String[] unused) throws InterruptedException {
        ParallelHello[] threads = new ParallelHello[10];
        for (int i = 0; i < 10; ++i) threads[i] = new ParallelHello(i);
        for (int i = 0; i < 10; ++i) threads[i].start();
        for (int i = 0; i < 10; ++i) threads[i].join();
        StdOut.println("Parallel program has completed");
    }

}
