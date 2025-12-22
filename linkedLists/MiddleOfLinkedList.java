package linkedLists;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: MiddleOfLinkedList
 */

public class MiddleOfLinkedList {

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

        private int middle() {
            Node fast = head;
            Node slow = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }
    }
}
