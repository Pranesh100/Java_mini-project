import java.util.*;
public class SetsEqualOrNot{
public static void main(String[] args){
Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
Set<Integer> s2=new HashSet<>(Arrays.asList(3,2,1));
chk(s1,s2);
}
static void chk(Set<Integer> s1,Set<Integer> s2){
System.out.println(s1.equals(s2));
}
}