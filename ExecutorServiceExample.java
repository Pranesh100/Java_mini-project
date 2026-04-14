import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    
    public static void main(String[] args) {
        
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks
        executor.submit(() -> task("Task-A"));
        executor.submit(() -> task("Task-B"));
        executor.submit(() -> task("Task-C"));

        // Shutdown the executor (no new tasks accepted)
        executor.shutdown();

        // Wait for all tasks to complete
        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("Main thread finished.");
    }

    private static void task(String taskName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running: " + i + " on thread: " 
                               + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(taskName + " completed.");
    }
}