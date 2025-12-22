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

        private void addAt(int index, int data) {
            if (index < 0 || index > size) {
                System.out.println("Invalid Index");
                return;
            } else if (index == 0) {
                addFirst(data);
            } else if (index == size) {
                addLast(data);
            } else {
                Node node = new Node();
                node.data = data;
                Node temp = head;

                for (int i = 0 ; i < index - 1 ; i++) {
                    temp = temp.next;
                }

                node.next = temp.next;
                temp.next = node;

                size++;
            }
        }

        private void removeLast() {
            if (size == 0) {
                System.err.println("This list is empty");
                return;
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0 ; i < size - 2 ; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        private void removeAt(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Invalid Index");
                return;
            } else if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0 ; i < index - 1 ; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addAt(2, 10);
        System.out.println();
        list.removeLast();
        list.display();
    }
}
