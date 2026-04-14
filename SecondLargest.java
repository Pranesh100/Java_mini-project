import java.util.*;
public class SecondLargest{
public static void main(String[] args){
List<Integer> l=new ArrayList<>(Arrays.asList(1,5,3,9,9,7));
sec(l);
}
static void sec(List<Integer> l){
Set<Integer> s=new HashSet<>(l);
List<Integer> t=new ArrayList<>(s);
Collections.sort(t);
System.out.println(t.get(t.size()-2));
}
}