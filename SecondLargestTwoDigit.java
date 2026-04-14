public class SecondLargestTwoDigit {
    public static void main(String[] args) {

        int[][] arr = {
            {3, 45, 75, 13},
            {93, 100, 4, 22},
            {56, 8, 11, 9}
        };

        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                int num = arr[i][j];

                if(num >= 10 && num <= 99) {   

                    if(num > largest) {
                        secondLargest = largest;
                        largest = num;
                    }
                    else if(num > secondLargest && num != largest) {
                        secondLargest = num;
                    }
                }
            }
        }

        System.out.println("Second Largest Two-Digit Number: " + secondLargest);
    }
}