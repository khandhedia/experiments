package com.nc.linkedlist;

/**
Following are the points in favour of Linked Lists.

        (1) The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance. Also, generally, the allocated memory is equal to the upper limit irrespective of the usage, and in practical uses, upper limit is rarely reached.



        (2) Inserting a new element in an array of elements is expensive, because room has to be created for the new elements and to create room existing elements have to shifted.

        For example, suppose we maintain a sorted list of IDs in an array id[].

        id[] = [1000, 1010, 1050, 2000, 2040, …..].

        And if we want to insert a new ID 1005, then to maintain the sorted order, we have to move all the elements after 1000 (excluding 1000).

        Deletion is also expensive with arrays until unless some special techniques are used. For example, to delete 1010 in id[], everything after 1010 has to be moved.

        So Linked list provides following two advantages over arrays
        1) Dynamic size
        2) Ease of insertion/deletion

        Linked lists have following drawbacks:
        1) Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists.
        2) Extra memory space for a pointer is required with each element of the list.
        3) Arrays have better cache locality that can make a pretty big difference in performance.

 **/

public class LLImpl
{
    public static void main(String[] args)
    {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        LinkedList linkedList = new LinkedList();
        linkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;


        printLL(linkedList);
        insertNodeAtHead(new Node(0), linkedList);
        insertNodeAtTail(new Node(6), linkedList);

    }

    private static void insertNodeAtTail(Node newNode, LinkedList linkedList)
    {
        Node pointerNode = linkedList.head;
        while (pointerNode.next != null)
        {
            pointerNode = pointerNode.next;
        }
        System.out.println("Inserting after " +  pointerNode);
        pointerNode.next = newNode;
        System.out.println();
        System.out.println("Printing after insertion " +  pointerNode);
        printLL(linkedList);

    }

    private static void insertNodeAtHead(Node newNode, LinkedList linkedList)
    {

        /**
         * Currently, head points to the first node with data = 1  (head --> 1,  1-->2 . 2 -->3 ....)
         * We want this current head node to be the next node to the head (newNode --> 1, 1--> 2)
         * That means, we want current head node to be the next node for the newNode ==> newNode.next = head
         * So, now, both newNode.next and head points to the second node (1)
         * We want head to point to the new Node
         */


        newNode.next = linkedList.head;
        linkedList.head = newNode;

        System.out.println();
        System.out.println("Inserted a new Node with data = 0, Let's see it printed");
        printLL(linkedList);


    }

    private static void printLL(LinkedList linkedList)
    {
        Node node = linkedList.head;
        while(node != null)
        {
            System.out.println(node);
            node = node.next;
        }
    }
}
