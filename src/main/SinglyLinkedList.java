package main;

public class SinglyLinkedList {
    Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }
        public void display() {
            Node n = head;
            while (n != null) {
                System.out.print(n.getData()+" ");
                n = n.next;
            }
        }
        public void push(int data)
        {
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;

        }

        public static void main(String[] args) {
            SinglyLinkedList l = new SinglyLinkedList();
            l.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            l.head.next = second;
            second.next = third;
            l.push(5);
            l.push(10);
            l.display();
        }
    }

