package leetCode;

import java.util.PriorityQueue;

public class MergeKSortedLists23 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        //

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        // Add the heads of all linked lists to the priority queue
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Dummy node to simplify code
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        // Process until the priority queue is empty
        while (!minHeap.isEmpty()) {
            // Get the minimum element from the priority queue
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;

            // Move to the next node in the linked list
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        MergeKSortedLists23 m = new MergeKSortedLists23();
        ListNode[] node = {new ListNode(1, new ListNode(4, new ListNode(5))), new ListNode(1, new ListNode(3, new ListNode(4))), new ListNode(2, new ListNode(6))};
        ListNode listNode = m.mergeKLists(node);//1,1,2,3,4,4,5,6
    }
}
