public class MaxMinDifference {
    public static void main(String[] args) {

        int[] arr = {3,5,11,22,9,6};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Difference: " + difference);
    }
}