package SLinkList;

import java.util.Arrays;

public class SingleLinkedList {
    private class Node{
        private int data;
        private Node next;

        public Node(int data,Node next) {
            this.data = data;
            this.next=null;
        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    Node head=null;
    static int size=0;
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        //linkedList.insert(12);
        for(int i=0;i<5;i++)
            linkedList.insert(i+1);
        //System.out.println(linkedList);
        //linkedList.display();
        System.out.println(linkedList);
        System.out.println(size);
    }@Override
    public String toString()
   {
       StringBuilder result = new StringBuilder();
       result.append("[");
       Node temp=this.head;
       while(temp!=null)
       {
            result.append(temp.getData());
            if(temp.next!=null)
                result.append(" ==> ");
            temp=temp.next;

       }
       result.append("]");
       return result.toString();

    }
    void insertHead (int data)
    {
        Node newNode = new Node(data);
         head=newNode;
         size++;
    }
        void insertAfter(int data,Node node)
        {
            Node newNode = new Node(data,node.next);
            node.next=newNode;
            size++;
        }

    public void insert (int data)
    {
        if(head==null)
        {
            insertHead(data);
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            insertAfter(data,temp);
        }
    }
     void display()
     {
         Node temp = head;
         while(temp!=null)
         {
             System.out.print(temp.getData()+" ");
             temp=temp.next;
         }

     }
}
