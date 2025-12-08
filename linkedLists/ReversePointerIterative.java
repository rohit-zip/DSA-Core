package linkedLists;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: ReversePointerIterative
 */

public class ReversePointerIterative {

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

        private Node getNodeAt(int index) {
            Node temp = head;
            for (int i = 0 ; i < index ; i++) {
                temp = temp.next;
            }
            return temp;
        }

        private void reverse() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.reverse();
        linkedList.display();
    }
}
