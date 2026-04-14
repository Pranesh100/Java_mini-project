import java.util.*;
public class Removeduplicate{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,67,8,1,5));
        remove(list);
    }
static void remove(List<Integer> list){
    Set<Integer> set = new HashSet<>(list);
    System.out.println(set);
}
}