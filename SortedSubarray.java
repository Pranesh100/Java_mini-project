import java.util.Arrays;
public class SortedSubarray{
    public static void main(String[] args) {
        int[] arr = {4,1,6,2,3}; 
        int target = 7;
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Subarrays with sum = " + target + ":");
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == target) {
                    System.out.print("[ ");
                    for(int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println("]");
                }
            }
        }
    }
}