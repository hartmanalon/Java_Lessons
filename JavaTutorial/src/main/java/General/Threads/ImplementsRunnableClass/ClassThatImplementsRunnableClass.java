package General.Threads.ImplementsRunnableClass;

public class ClassThatImplementsRunnableClass implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("ClassThatImplementsRunnableClass: " + "ID is: " + Thread.currentThread().getId() + " and value is: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}