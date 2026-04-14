import java.util.*;
public class UnionTwoSets{
public static void main(String[] args){
Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
uni(s1,s2);
}
static void uni(Set<Integer> s1,Set<Integer> s2){
Set<Integer> s=new HashSet<>(s1);
s.addAll(s2);
System.out.println(s);
}
}