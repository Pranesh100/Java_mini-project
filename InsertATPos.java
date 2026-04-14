public class InsertATPos {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int val = 10;
        int pos = 2;    

        head = insertAtPosition(head, val, pos);
        printList(head);
    }
    public static Node insertAtPosition(Node head, int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); 
    }
}