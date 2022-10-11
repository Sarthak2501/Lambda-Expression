public class LambdaExpCreatingThreadExample {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is Running......");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
        //t1.suspend();

        //The Runnable interface should be implemented by any class whose
        // instances
        // are intended to be executed by a thread.
        // The class must define a method of no arguments called run.
        //This interface is designed to provide a common protocol for objects that
        // wish to execute code while they are active.
        // For example, Runnable is implemented by class Thread.
        // Being active simply means that a thread has been started and has not yet
        // been stopped.
        //In addition, Runnable provides the means for a class to be active
        // while not subclassing Thread.
        // A class that implements Runnable can run without subclassing
        // Thread by instantiating a Thread instance and passing
        // itself in as the target. In most cases, the Runnable interface
        // should be used if you are only planning to override the run()
        // method and no other Thread methods.
        // This is important because classes should not be subclassed
        //unless the programmer intends on modifying or enhancing the
        // fundamental behavior of the class.

        Runnable r2 = () -> {
            System.out.println("Thread2 is running......");
        };

        Thread t2 = new Thread(r2);
        t2.start();
    }
}
