import org.junit.Assert;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList list;
    ListNode a;
    ListNode b;
    ListNode c;

    @org.junit.Before
    public void setUp() {
        list = new LinkedList();
        a = new ListNode("Peter");
        b = new ListNode("Paul");
        c = new ListNode("Mary");
        list.add(a);
        list.add(b);
        list.add(c);
    }

    @org.junit.Test
    public void add() {
        String actual = list.getHead().getData().toString();

        System.out.println(actual);
        Assert.assertEquals("Peter", actual);
    }

    @org.junit.Test
    public void add2() {
        String actual = list.getHead().getNext().getData().toString();

        System.out.println(actual);
        Assert.assertEquals("Paul", actual);
    }

    @org.junit.Test
    public void add3() {
        String actual = list.getTail().toString();

        System.out.println(actual);
        Assert.assertEquals("Mary", actual);
    }

    @org.junit.Test
    public void remove() {
        list.remove(a);
        int actual = list.getLength();

        System.out.println(list);
        Assert.assertEquals(2, actual);
    }

    @org.junit.Test
    public void remove2() {
        list.remove(b);
        int actual = list.getLength();

        System.out.println(list);
        Assert.assertEquals(2, actual);
    }

    @org.junit.Test
    public void remove3() {
        list.remove(c);
        int actual = list.getLength();

        System.out.println(list);
        Assert.assertEquals(2, actual);
    }

    @org.junit.Test
    public void getHead() {
        Assert.assertEquals("Peter", list.getHead().toString());
    }

    @org.junit.Test
    public void getTail() {
        Assert.assertEquals("Mary", list.getTail().toString());
    }

    @org.junit.Test
    public void getLength() {
        Assert.assertEquals(3, list.getLength());
    }
}