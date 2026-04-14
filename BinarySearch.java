public class BinarySearch {
    public static void main(String[] args){
        int arr[]={3,7,8,12,13,17,58,64,78,110};
        int key=58;
        int low=0;
        int high=arr.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                System.out.println("index=" + mid);
                System.out.println("position=" + (mid+1));
                break;
            }
            else if(key > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
}
