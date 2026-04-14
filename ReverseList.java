import java.util.*;
public class ReverseList{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,5,67,8));
        Collections.reverse(list);
        System.out.println(list);
}
}
