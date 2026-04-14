class Node{
    int data;
    Node prev;
    Node next;

    Node(int value){
        data=value;
        prev=null;
        next=null;
    }
}
public class DoubleLL{
    Node head=null;
    public void createList(){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);

        head=n1;
        n1.next=n2;
        n2.prev=n1;

        n2.next=n3;
        n3.prev=n2;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data + "<->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        DoubleLL list=new DoubleLL();
        list.createList();
        list.display();
    }
}
