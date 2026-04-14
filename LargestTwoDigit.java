public class LargestTwoDigit {
    public static void main(String[] args) {

        int[] k = {3,5,75,13,93,100,4};

        int largest = -1;

        for(int i = 0; i < k.length; i++) {

            if(k[i] >= 10 && k[i] <= 99) {   
                if(k[i] > largest) {
                    largest = k[i];
                }
            }

        }

        System.out.println("Largest two digit number = " + largest);
    }
}