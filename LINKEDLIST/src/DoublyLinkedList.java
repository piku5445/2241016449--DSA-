import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert at the beginning of the doubly linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end of the doubly linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        if (prevNode.next != null) {
            prevNode.next.prev = newNode;
        }
        prevNode.next = newNode;
    }

    // Delete a node by data value
    public void delete(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                return;
            }
            current = current.next;
        }

        System.out.println("Node with data " + data + " not found.");
    }

    // Display the doubly linked list
    public void display() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert at the beginning
        dll.insertAtBeginning(1);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(3);

        // Display the doubly linked list
        dll.display(); // Output: 3 2 1

        // Insert at the end
        dll.insertAtEnd(4);
        dll.insertAtEnd(5);

        // Display the doubly linked list
        dll.display(); // Output: 3 2 1 4 5

        // Insert after a given node (insert 99 after node with data 1)
        Node nodeWithData1 = dll.head.next.next; // Node with data 1
        dll.insertAfter(nodeWithData1, 99);

        // Display the doubly linked list
        dll.display(); // Output: 3 2 1 99 4 5

        // Delete a node with data 1
        dll.delete(1);

        // Display the doubly linked list after deletion
        dll.display(); // Output: 3 2 99 4 5

        // You can continue adding more elements or performing other operations on the doubly linked list.
    }
}
