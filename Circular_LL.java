class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class Circular_LL{
    Node head=null;
    public void createList(){
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);

        head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=head;
    }
    public void display(){
        if(head==null) return;
        Node temp=head;
        do{
            System.out.print(temp.data+" -> ");
            temp=temp.next;
    }while(temp!=head);
        System.out.println("(back to head)");
    }
    public static void main(String[] args) {
        Circular_LL list=new Circular_LL();
        list.createList();
        list.display();
    }
}

