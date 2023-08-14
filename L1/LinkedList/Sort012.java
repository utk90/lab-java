package LinkedList;

class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class Sort012 {
    public static Node sortList(Node head) {
        Node nodeZero = new Node(0);
        Node nodeOne = new Node(1);
        Node nodeTwo = new Node(2);

        Node temp = head;
        Node tempZero = nodeZero;
        Node tempOne = nodeOne;
        Node tempTwo = nodeTwo;

        while (temp != null) {
            if (temp.data == 0) {
                nodeZero.next = new Node(0);
                nodeZero = nodeZero.next;
            } else if (temp.data == 1) {
                nodeOne.next = new Node(1);
                nodeOne = nodeOne.next;
            } else {
                nodeTwo.next = new Node(2);
                nodeTwo = nodeTwo.next;
            }

            temp = temp.next;
        }

        // merge linkedlists
        head = tempZero.next;
        nodeZero.next = tempOne.next;
        nodeOne.next = tempTwo.next;

        return head;
    }
}