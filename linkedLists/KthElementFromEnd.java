package linkedLists;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: KthElementFromEnd
 */

public class KthElementFromEnd {

    private static class Node {
        int data;
        Node next;
    }

    private static class LinkedList {
        Node head;
        Node tail;
        int size;

        private void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }

        private void addFirst(int data) {
            Node node = new Node();
            node.data = data;
            size++;
            if (size == 0) {
                head = tail = node;
            } else {
                node.next = head;
                head = node;
            }
        }

        private int kthFromLast(int k) {
            Node slow = head;
            Node fast = head;

            for (int i=0 ; i<k ; i++) {
                fast = fast.next;
            }

            while (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        linkedList.addFirst(7);
        linkedList.addFirst(8);
        linkedList.addFirst(9);
        linkedList.addFirst(10);
        linkedList.display();
        System.out.println(linkedList.kthFromLast(2));
    }
}
