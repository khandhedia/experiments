package com.nc.linkedlist;

public class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
