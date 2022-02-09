package leetCode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(0);
        ListNode tail = listNode;
        while (true){
            if (list1 == null){
                tail.next = list2;
                break;
            }
            if (list2 == null){
                tail.next = list1;
                break;
            }
            if (list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return listNode.next;
    }
}
