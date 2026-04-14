import java.util.ArrayList;
class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class Palindrome_LL{
    Node head=null;
    public void insert(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public boolean isPalindrome(){
        ArrayList<Integer> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        int i=0, j=list.size()-1;
        while(i<j){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Palindrome_LL list=new Palindrome_LL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
        System.out.println("Is Palindrome? "+list.isPalindrome());
    }
}

