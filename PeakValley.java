public class PeakValley {
    public static void main(String[] args) {

        int[] arr = {1,3,2,5,4,7,6};

        int greater = 0;
        int smaller = 0;

        for(int i = 0; i < arr.length - 2; i++) {

            if(arr[i+1] > arr[i] && arr[i+1] > arr[i+2])
                greater++;

            else if(arr[i+1] < arr[i] && arr[i+1] < arr[i+2])
                smaller++;
        }

        System.out.println("greater = " + greater);
        System.out.println("smaller = " + smaller);
    }
}
