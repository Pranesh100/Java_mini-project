public class MultiplicationTablesRunnable {

    private static final Object lock = new Object();
    private static int currentTable = 1;  

    public static void main(String[] args) {


        Runnable table5 = new TableRunnable(5, "Table-5");
        Runnable table7 = new TableRunnable(7, "Table-7");
        Runnable table2 = new TableRunnable(2, "Table-2");

 
        Thread t5 = new Thread(table5, "Thread-5");
        Thread t7 = new Thread(table7, "Thread-7");
        Thread t2 = new Thread(table2, "Thread-2");

        
        t5.start();
        t7.start();
        t2.start();
    }


    static class TableRunnable implements Runnable {
        private final int number;
        private final String threadName;

        public TableRunnable(int number, String threadName) {
            this.number = number;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            synchronized (lock) {
             
                while (currentTable != getTableOrder(number)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                
                System.out.println("\n=== " + threadName + " started ===");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " × " + i + " = " + (number * i));
                    
                    try {
                        Thread.sleep(80); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

           
                currentTable++;
                lock.notifyAll();
            }
        }


        private int getTableOrder(int num) {
            if (num == 5) return 1;
            if (num == 7) return 2;
            if (num == 2) return 3;
            return 0;
        }
    }
}