public class MyRunnable implements Runnable {
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }
}

class ThreadTester {
    public static void main (String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}
// "back in time"
// "top o' the stack"