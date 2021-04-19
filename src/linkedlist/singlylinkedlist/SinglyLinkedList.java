package linkedlist.singlylinkedlist;

public class SinglyLinkedList
{
    private class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }
    private Node first;

    public void insertLast(int data)
    {
        if(first == null) {
            first = new Node(data);
            return;
        }
        Node tmp = first;
        while (tmp.next != null)
            tmp = tmp.next;
        tmp.next = new Node(data);
    }
    public void insertFirst(int data)
    {
        Node nd = new Node(data);
        if(first == null)
        {
            first = nd;
            return;
        }
        nd.next = first;
        first = nd;
    }
    public String toString()
    {
        Node tmp = first;
        StringBuilder sb = new StringBuilder("");
        while (tmp != null) {
            sb.append(tmp.data).append(" ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}
