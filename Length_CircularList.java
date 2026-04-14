class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class Length_CircularList{
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
    public int length(){
        if(head==null) return 0;
        int count=0;
        Node temp=head;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        return count;
    }
    public static void main(String[] args){
        Length_CircularList list=new Length_CircularList();
        list.createList();
        System.out.println("Length of Circular List: "+list.length());
    }
    
}