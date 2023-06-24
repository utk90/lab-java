package LinkedList;

public class LinkedList {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            tail = head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            tail = newNode;
        }
    }

    // insert node at start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
    }

    // insert node at a position
    public void insertAtIndex(int data, int idx) {
        Node newNode = new Node(data);
        int ctr = 0;

        if (head == null) {
            insertAtStart(data);
        } else {
            Node temp = head;
            // insert at start
            if (idx == 0) {
                insertAtStart(data);
                return;
            }

            // iterate till prev idx
            while (ctr < idx - 1) {
                temp = temp.next;

                if (temp.next == null) {
                    insertAtEnd(data);
                    return;
                }

                ctr++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            System.out.println("LinkedList empty!! No node to delete");
            return true;
        }
        return false;
    }

    // delete first node
    public void deleteStart() {
        if (isEmpty()) {
            return;
        }

        // check if only one element present
        if (head.next == null) {
            head = tail = null;
            return;
        }

        head = head.next;
    }

    // delete last node
    public void deleteEnd() {
        if (isEmpty()) {
            return;
        }

        // check if only one element present
        if (head.next == null) {
            head = tail = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // delete node at index
    public void deleteAtIndex(int idx) {
        if (isEmpty()) {
            return;
        }

        if (idx == 0) {
            deleteStart();
            return;
        }

        int ctr = 0;
        Node temp = head;

        while (ctr < idx - 1) {
            if (temp == null) {
                System.out.println("Entered index out of bound");
                return;
            }

            temp = temp.next;
            ctr++;
        }

        if (temp.next == null) {
            System.out.println("Entered index out of bound");
            return;
        }

        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }
    }

    // display linked list nodes
    public void displayLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList myLL = new LinkedList();
        myLL.insertAtStart(-10);
        myLL.insertAtStart(-20);
        myLL.insertAtStart(-30);
        myLL.insertAtStart(-40);
        myLL.displayLL();
        myLL.insertAtEnd(0);
        myLL.insertAtEnd(5);
        myLL.insertAtEnd(10);
        myLL.insertAtEnd(15);
        myLL.displayLL();
        myLL.insertAtIndex(29, 6);
        myLL.displayLL();
        myLL.deleteStart();
        myLL.displayLL();
        myLL.deleteStart();
        myLL.displayLL();
        myLL.deleteEnd();
        myLL.displayLL();
        myLL.deleteEnd();
        myLL.deleteEnd();
        myLL.deleteEnd();
        myLL.displayLL();
        myLL.insertAtEnd(15);
        myLL.displayLL();
        myLL.deleteAtIndex(3);
        myLL.displayLL();
        myLL.deleteAtIndex(0);
        myLL.displayLL();
    }
}
