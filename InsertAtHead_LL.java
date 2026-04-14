class Node {
    int data;
    Node next;

    Node(int value) {   
        data = value;   
        next = null;
    }
}

public class InsertAtHead_LL {
    Node head = null;

    public void insert(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        InsertAtHead_LL list = new InsertAtHead_LL();

        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.display();
    }
}