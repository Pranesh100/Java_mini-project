class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Insert_LinkedList{
    Node head;
    public void insertAtPosition(int data, int pos){
        Node newNode = new Node(data);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            if(temp==null){
                System.out.println("Position out of bounds");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Insert_LinkedList list = new Insert_LinkedList();
        list.insertAtPosition(40, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(15, 2);
        list.display();
    }
}
