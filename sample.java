import java.util.Scanner;
class ListNode{
    int data;
    ListNode next;
}
public class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ListNode head=null;
        ListNode tail=null;
        int n=4;
        while(n>0){
            int data = sc.nextInt();
            ListNode newNode = new ListNode();
            newNode.data=data;
            newNode.next=null;
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            n--;
        }
    }
}