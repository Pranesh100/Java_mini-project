public class Pattern {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};

        for(int i = 0; i < arr.length; i++) {

            if(i == 0 || i == arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i-1] * arr[i+1] + " ");
        }
    }
}