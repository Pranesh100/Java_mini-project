public class MoveZeroes {
    
    public static void main(String[] args) {
        
        int[] arr = {5, 0, 3, 0, 0, 8, 1, 0, 2, 4};
        
        int index = 0;   
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.print("Result : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}