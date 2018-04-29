package General.Threads.ExtendsTreadClass;

public class TestClass {

    public static void main(String args[]){
        ClassThatExtendsTreadClass t1 = new ClassThatExtendsTreadClass();
        ClassThatExtendsTreadClass t2 = new ClassThatExtendsTreadClass();

        t1.start();
        t2.start();
    }

}
