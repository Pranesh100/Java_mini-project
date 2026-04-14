public class Recursion {
    public static void display(int n){
        if(n<1){
            return;
        }else{
            System.out.println(n);
            display(n-1);
            System.out.println(n);
        }

    }
    public static void main(String[] args){
        int n=3;
        display(n);
    }
}
