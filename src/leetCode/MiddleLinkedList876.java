package leetCode;

public class MiddleLinkedList876 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    int count = 0;
    public ListNode middleNode(ListNode head) {
        //
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleLinkedList876 m = new MiddleLinkedList876();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);

        ListNode listNode = m.middleNode(node);
        while (listNode != null){
            System.out.print(listNode.val+" ");
            listNode = listNode.next;
        }


    }
}
