package linkedLists;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: Reverse
 */

public class ReverseDataIterative {

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
            int li = 0;
            int hi = size - 1;

            while (li < hi) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(hi);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                li++;
                hi--;
            }
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
