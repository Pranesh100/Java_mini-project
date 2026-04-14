public class MaxConsecutiveChars {

    public static void main(String[] args) {

        String input1 = "EEEEEEE";
        String input2 = "ELELEEL";

        
        Runnable r1 = new MaxConsecutiveRunnable(input1, "Input-1");
        Runnable r2 = new MaxConsecutiveRunnable(input2, "Input-2");

      
        Thread t1 = new Thread(r1, "Thread-1");
        Thread t2 = new Thread(r2, "Thread-2");

        t1.start();
        t2.start();
    }

   
    static class MaxConsecutiveRunnable implements Runnable {
        private final String str;
        private final String threadName;

        public MaxConsecutiveRunnable(String str, String threadName) {
            this.str = str;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            if (str == null || str.isEmpty()) {
                System.out.println(threadName + " Result: 0");
                return;
            }

            int maxCount = 1;
            int currentCount = 1;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    currentCount++;
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                    }
                } else {
                    currentCount = 1;
                }
            }

            System.out.println(threadName + " Result: " + maxCount);
        }
    }
}