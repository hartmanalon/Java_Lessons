package General.Threads.ThreadFromTheMainClass;

public class ThreadFromTheMainClass {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println("ThreadFromTheMainClass: " + "ID is: " + Thread.currentThread().getId() + " and value is: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
    }
}
