import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // array input
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = -1;

        // searching element
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        // output
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not present in array");
        }

        sc.close();
    }
}