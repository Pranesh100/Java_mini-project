class Node {
    int data;
    Node next;
}

class MultipleVar_LinkedList {
    public static void main(String[] args) {

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.data = 10;
        node2.data = 20;
        node3.data = 30;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        Node temp = node1;
        Node sk = node1;
        Node ek = node1;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        sk.data = 100;
        ek.next.data = 200;

        System.out.println(node1.data);
        System.out.println(sk.next.next.data);
        System.out.println(node1.next.data);
    }
}