package tests;
import linkedlist.singlylinkedlist.SinglyLinkedList;
import org.junit.*;
import static org.junit.Assert.*;
public class TestLinkedList
{
    @Test
    public void testLinkedList()
    {
        SinglyLinkedList ls = new SinglyLinkedList();
        ls.insertFirst(2);
        ls.insertLast(7);
        ls.insertFirst(4);
        ls.insertFirst(0);
        assertEquals(ls.toString(), "0 4 2 7 ");
    }
}
