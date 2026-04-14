import java.util.*;
public class MinMax{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,67,8));
        int min=Collections.min(list);
        int max=Collections.max(list);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
}
}