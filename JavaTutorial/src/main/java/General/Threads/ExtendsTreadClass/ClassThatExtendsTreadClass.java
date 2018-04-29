package General.Threads.ExtendsTreadClass;

public class ClassThatExtendsTreadClass extends Thread {

    public void run() {
        for(int i=1; i<5; i++) {
            System.out.println("ClassThatExtendsTreadClass " + "ID is: " + Thread.currentThread().getId() + " and value is: " + i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
