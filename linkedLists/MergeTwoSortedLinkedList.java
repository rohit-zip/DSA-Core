package linkedLists;

/*
  Developer: Rohit Parihar
  Project: DSA Core
  GitHub: github.com/rohit-zip
  File: MergeTwoSortedLinkedList
 */

public class MergeTwoSortedLinkedList {

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

        private static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
            Node one = list1.head;
            Node two = list2.head;

            LinkedList list = new LinkedList();

            while (one!= null && two != null) {
                if (one.data < two.data) {
                    list.addLast(one.data);
                    one = one.next;
                } else {
                    list.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                list.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                list.addLast(two.data);
                two = two.next;
            }

            return list;
        }
    }

    public static void main(String[] args) {

    }
}
