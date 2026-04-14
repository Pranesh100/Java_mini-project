public class ReverseGreatest {
    public static void main(String[] args) {

        int[] v = {3,5,17,4,8,3};

        int y = v[v.length - 1]; 
        System.out.println(y);

        for(int i = v.length - 2; i >= 0; i--) {

            if(v[i] > y) {
                y = v[i];
                System.out.println(y);
            }

        }
    }
}
