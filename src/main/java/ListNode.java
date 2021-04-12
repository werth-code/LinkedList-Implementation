public class ListNode <T> {
    private T data;
    private ListNode prev;
    private ListNode next;

    public ListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public ListNode getPrev() {
        return prev;
    }

    public ListNode getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
