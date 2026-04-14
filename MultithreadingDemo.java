public class MultithreadingDemo {
    
    public static void main(String[] args) {
        
        System.out.println("=== Main Thread Started === " 
                           + Thread.currentThread().getName());

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-1 : " + i);
                try {
                    Thread.sleep(400);   // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread-1 Finished.");
        }, "Thread-1");

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread-2 : " + i);
                try {
                    Thread.sleep(600);   // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread-2 Finished.");
        }, "Thread-2");

        t1.start();
        t2.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("=== Main Thread Finished ===");
    }
}
