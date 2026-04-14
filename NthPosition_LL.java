class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class NthPosition_LL{
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
    public void findNthFromEnd(int n){
        Node first=head;
        Node second=head;
        for(int i=0; i<n; i++){
            if(first==null){
                System.out.println("List is shorter than n");
                return;
            }
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        System.out.println("Nth node from end: "+second.data);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        NthPosition_LL list=new NthPosition_LL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.display();
        int n=2;
        list.findNthFromEnd(n);
    }
}
