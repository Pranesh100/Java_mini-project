public class BubbleSortSecondLargest {
    public static void main(String[] args){
        int arr[] = {5,2,18,1,3};
        int n=arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.println("sorted array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSecond largest element: "+arr[n-2]);
    }
}
