package General.Threads.ImplementsRunnableClass;

public class TestClass {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ClassThatImplementsRunnableClass());
        Thread t2 = new Thread(new ClassThatImplementsRunnableClass());

        t1.start();
        t2.start();

    }
}
