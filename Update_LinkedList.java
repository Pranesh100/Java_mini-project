class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void update(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value not found");
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Update_LinkedList{
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.print("Before update: ");
        list.display();

        list.update(20, 25);

        System.out.print("After update: ");
        list.display();
    }
}