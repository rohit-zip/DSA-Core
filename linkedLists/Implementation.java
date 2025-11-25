package linkedLists;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: LinkedList
 */

public class Implementation {

    private static class Node {
        int data;
        Node next;
    }

    private static class LinkedList {
        Node head;
        Node tail;
        int size;

        private void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (this.size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }
    }

    public static void main(String[] args) {

    }
}
