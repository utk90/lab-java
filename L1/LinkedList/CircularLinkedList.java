package LinkedList;

public class CircularLinkedList {
    Node tail; // can access tail and head (tail.next)

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // inserts node after ref node
    public void insertNode(int ref, int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
            return;
        }

        Node temp = tail;

        while (temp.data != ref) {
            // traversed whole LinkedList (ref not present)
            if (temp.next == tail) {
                System.out.println("Reference node not present");
                return;
            }

            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteNode(int data) {
        if (isEmpty()) {
            return;
        }

        // single element present
        if (tail.next == tail) {
            if (tail.data == data) {
                tail = null;
                return;
            }
            System.out.println("Entered data to delete does not exists!!");
        } else {
            Node temp = tail;

            while (temp.next.data != data) {
                temp = temp.next;

                if (temp == tail) {
                    System.out.println("Entered data to delete does not exists!!");
                    return;
                }
            }

            if (temp.next == tail) {
                tail = temp.next.next;
            }

            temp.next = temp.next.next;
        }
    }

    public void display() {
        Node temp = tail;

        if (isEmpty()) {
            return;
        }

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail);

        System.out.println();
    }

    public boolean isEmpty() {
        if (tail == null) {
            System.out.println("LinkedList empty!!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CircularLinkedList myCLL = new CircularLinkedList();
        myCLL.insertNode(-1, 10);
        myCLL.display();
        myCLL.insertNode(10, 15);
        myCLL.insertNode(15, 20);
        myCLL.insertNode(20, 0);
        myCLL.display();
        myCLL.deleteNode(15);
        myCLL.display();
    }
}
