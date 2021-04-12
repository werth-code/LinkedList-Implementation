public class Main {
    public static void main(String[] args) {

        ListNode a = new ListNode("Peter");
        ListNode b = new ListNode("Paul");
        ListNode c = new ListNode("Mary");

        LinkedList list = new LinkedList();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println(list);

        System.out.println(list.remove(a));
        System.out.println(list);
    }
}
