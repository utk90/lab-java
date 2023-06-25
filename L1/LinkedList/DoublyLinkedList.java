package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
            return;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
            return;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtIndex(int data, int idx) {
        Node newNode = new Node(data);

        if (idx < 0)
            return;

        if (idx == 0) {
            insertAtStart(data);
            return;
        }

        Node temp = head;
        int ctr = 1;

        while (ctr < idx) {
            if (temp.next == null) {
                System.out.println("Invalid index entered!!");
                return;
            }
            temp = temp.next;
            ctr++;
        }

        if (temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
    }

    public void deleteAtStart() {
        if (isEmpty()) {
            return;
        } else {
            // check only one element present
            if (head.next == null) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            return;
        } else {
            // check only one element present
            if (tail.prev == null) {
                head = tail = null;
            } else {
                tail = tail.prev;
            }
        }
    }

    public void deleteAtIndex(int idx) {
        if (isEmpty()) {
            return;
        } else {
            if (idx < 0) {
                System.out.println("Entered index out of bound");
                return;
            }

            // check only one element present
            if (head.next == null) {
                if (idx == 0) {
                    head = tail = null;
                }
            } else {
                if (idx == 0) {
                    head = head.next;
                    return;
                }

                int ctr = 1;
                Node temp = head;

                while (ctr < idx) {
                    if (temp.next == null) {
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
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void displayReverse() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public boolean isEmpty() {
        if (head == null) {
            System.out.println("LinkedList empty!!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList();
        myDLL.insertAtStart(0);
        myDLL.insertAtStart(5);
        myDLL.insertAtStart(10);
        myDLL.display();
        myDLL.insertAtEnd(20);
        myDLL.display();
        myDLL.insertAtStart(13);
        myDLL.insertAtEnd(23);
        myDLL.display();
        // myDLL.displayReverse();
        myDLL.insertAtIndex(58, 7);
        myDLL.display();
        myDLL.deleteAtIndex(-1);
        myDLL.display();
    }
}
