package multithreading;

import com.sun.security.jgss.GSSUtil;

public class testVolatile extends Thread{
    //add volatile to keepRunning
    boolean keepRunning = true;

    public void run(){
        long count = 0;
        while(keepRunning){
            count=count+1;
        }
        System.out.println("Thread Terminated.." + count);
    }

    public static void main(String[] args) throws InterruptedException {
        testVolatile v = new testVolatile();
        v.start();
        Thread.sleep(1000);
        System.out.println("Sleeping in main block");
        v.keepRunning=false;
        v.join();
        System.out.println("Keep Running is set to false");
    }
}
