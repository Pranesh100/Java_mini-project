public class SearchCount {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                System.out.println("Found at index: " + i);
                System.out.println("Found at position: " + (i + 1));
                System.err.println("Count: " + count);
                return;
            }
        }

        System.out.println("Not found");
    }
}