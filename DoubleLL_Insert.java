public class DoubleLL_Insert {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int value) {
            data = value;
            prev = null;
            next = null;
        }
    }

    Node head = null;

    public void insertAtPosition(int value, int pos) {
        Node newNode = new Node(value);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoubleLL_Insert list = new DoubleLL_Insert();

        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(40, 4); 
        list.insertAtPosition(25, 3); 

        list.display();
    }
}