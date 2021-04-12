public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public LinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(ListNode node) {
        // if there is no head - make this our head and tail and increase length.
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }
        else { // there are nodes present - go to the tail and add our next node - make new node our tail. Increase Length.
            ListNode prevTail = this.tail;

            prevTail.setNext(node);
            node.setPrev(prevTail);
            this.tail = node;
        }
        length++;
    }


    public Boolean remove(ListNode node) {
        if(this.length == 0) return false;

        else if(this.length == 1) {
            this.head = null;
            this.tail = null;
        }

        else if(node == this.head) {
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }

        else if(node == this.tail) {
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
        }

        else {
            ListNode currentNode = this.getHead();
            while(currentNode != node && currentNode != null) {
                currentNode = currentNode.getNext();
            }
            if(currentNode == null) return false;
            else {
                currentNode.getPrev().setNext(currentNode.getNext()); //set its prev nodes next value to be the next node..
                currentNode.getNext().setPrev(currentNode.getPrev()); //set its next nodes prev value to be the prev node..
            }
        }
        length--;
        return true;
    }


    public ListNode getHead() {
        return head;
    }


    public ListNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
