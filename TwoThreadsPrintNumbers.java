public class TwoThreadsPrintNumbers {

    public static void main(String[] args) {
        
        // Thread 1: Print 1 to 50
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(50); // Small delay to see interleaving clearly
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Thread-1");

        // Thread 2: Print 51 to 100
        Thread t2 = new Thread(() -> {
            for (int i = 51; i <= 100; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(50); // Small delay to see interleaving
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}