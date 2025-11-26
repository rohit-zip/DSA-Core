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

        private void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }

        private int size() {
            return this.size;
        }

        private void removeFirst() {
            if (size == 0)
                System.out.println("The list is empty");
            else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        private int getFirst() {
            if (size == 0) {
                System.out.println("The list is empty");
                return -1;
            }
            return head.data;
        }

        private int getLast() {
            if (size == 0) {
                System.out.println("The list is empty");
            }
            return tail.data;
        }

        private int getAt(int index) {
            if (size == 0) {
                System.out.println("The list is empty");
                return -1;
            }
            if (index >= size || index < 0) {
                System.out.println("Invalid Index");
                return -1;
            }
            Node temp = head;
            for (int i = 0 ; i < index ; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        private void addFirst(int data) {
            Node node = new Node();
            node.data = data;

            if (size == 0) {
                head = tail = node;
            } else {
                node.next = head;
                head = node;
            }

            size++;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println(list.getAt(4));
    }
}
