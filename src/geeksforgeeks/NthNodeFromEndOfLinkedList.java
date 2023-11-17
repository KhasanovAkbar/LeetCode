package geeksforgeeks;

public class NthNodeFromEndOfLinkedList {

    //Function to find the data of nth node from the end of a linked list.
    static Node head;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    int getNthFromLast(Node head, int n) {
        // Your code here
        if (head == null || n <= 0)
            return -1;
        Node mainPointer = head;
        Node referancePointer = head;
        int count = 0;
        while (count < n) {
            if (referancePointer == null)
                return -1;
            referancePointer = referancePointer.next;
            count++;
        }
        while (referancePointer != null) {
            mainPointer = mainPointer.next;
            referancePointer = referancePointer.next;
        }
        return mainPointer.data;
    }

    public static void main(String[] args) {
        NthNodeFromEndOfLinkedList n = new NthNodeFromEndOfLinkedList();

        n.push(9);
        n.push(8);
        n.push(7);
        n.push(6);
        n.push(5);
        n.push(4);
        n.push(3);
        n.push(2);
        n.push(1);


        System.out.println(n.getNthFromLast(head, 4));
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}
