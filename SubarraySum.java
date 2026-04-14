public class SubarraySum {

    public static void findSubarrays(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    count++;

                    System.out.print("Subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("Total subarrays = " + count);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -2, 5};
        int target = 5;

        findSubarrays(numbers, target);
    }
}