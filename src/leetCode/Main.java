package leetCode;


import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

      /*  LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("asssaaqw"));*/
        ZigzagConversion z = new ZigzagConversion();
        System.out.println(z.convert("PAYPALISHIRING", 4));

       /* PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(16));*/

    /*    MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        System.out.println(m.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));*/

      /*  BigPow b = new BigPow();
        System.out.println(b.powTwoNumber(BigInteger.valueOf(123), 1234));*/


        // System.out.println(2 & 4);

       


      /*  ListNode l = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        l.next = l1;
        l1.next = l2;

        //list boshiga element qo'shish;
        ListNode newNode = new ListNode(0);
        newNode.next = l;

        //list o'rtasiga element qo'shish;
        ListNode insertAfter = new ListNode(5);
        insertAfter.next = l1.next;
        l1.next = insertAfter;

        //list oxiriga element qo'shish;
        ListNode insertEnd = new ListNode(20);
        ListNode last = newNode;
        while (last.next != null) {
            last = last.next;
        }
        last.next = insertEnd;

        //listdan element o'chirish
        int delete = 20;
        ListNode temp = newNode;
        if (temp.val == delete) {
            newNode = temp.next;
        } else {
            ListNode prev;
            while (temp != null) {
                prev = temp;
                temp = temp.next;

                if (temp.val == delete) {
                    prev.next = temp.next;
                    temp = null;
                }
            }
        }


        //linked listni ekranga chiqarish
        while (newNode != null) {
            System.out.println(newNode.val + " ");
            newNode = newNode.next;
        }
*/






/*        leetCode.TwoSum s = new leetCode.TwoSum();
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 4, 5, 6, 7, 8, 9, 5, 3}, 9)));*/
/*        leetCode.AddTwoNumbers a = new leetCode.AddTwoNumbers();
        leetCode.ListNode listNode1 = new leetCode.ListNode(7);
        leetCode.ListNode listNode2 = new leetCode.ListNode(9);
        leetCode.ListNode listNode3 = new leetCode.ListNode(5);
        listNode1.next = listNode2;
        listNode1.next = listNode3;

        leetCode.ListNode b1 = new leetCode.ListNode(7);
        leetCode.ListNode b2 = new leetCode.ListNode(0);
        leetCode.ListNode b3 = new leetCode.ListNode(5);
        b1.next = b2;
        b1.next = b3;

        System.out.println(a.addTwoNumbers(listNode1, b1));*/

        /*leetCode.Palindrome p = new leetCode.Palindrome();
        System.out.println(p.isPalindrome(1221));*/

       /* leetCode.Roman r = new leetCode.Roman();
        System.out.println(r.romanToInt("MMMMI"));*/

        /*leetCode.LongestCommonPrefix l = new leetCode.LongestCommonPrefix();
        System.out.println(l.longestCommonPrefix(new String[]{"dog","racecar","car"}));*/

      /*  leetCode.ValidParentheses v = new leetCode.ValidParentheses();
        System.out.println(v.isValid("{{}[][[[]]]}"));*/

     /*   MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new leetCode.ListNode(5));
        llist1.addToTheLast(new leetCode.ListNode(10));
        llist1.addToTheLast(new leetCode.ListNode(15));

        // Node head2 = new leetCode.ListNode()(2);
        llist2.addToTheLast(new leetCode.ListNode(2));
        llist2.addToTheLast(new leetCode.ListNode(3));
        llist2.addToTheLast(new leetCode.ListNode(20));


        llist1.head = new leetCode.MergeTwoSortedLists().mergeTwoLists(llist1.head,
                llist2.head);
        llist1.printList();*/

       /* leetCode.ListNode l = new leetCode.ListNode(5);
        leetCode.ListNode l1 = new leetCode.ListNode(10);
        leetCode.ListNode l2 = new leetCode.ListNode(15);
        l.next = l1;
        l1.next = l2;


        leetCode.ListNode n = new leetCode.ListNode(2);
        leetCode.ListNode n1 = new leetCode.ListNode(3);
        leetCode.ListNode n2 = new leetCode.ListNode(20, null);
        n.next = n1;
        n1.next = n2;

        leetCode.MergeTwoSortedLists mergeTwoSortedLists = new leetCode.MergeTwoSortedLists();
        System.out.println(mergeTwoSortedLists.mergeTwoLists(l, n));
*/


      /*  LinkedList<String> list1 = new LinkedList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.addFirst("0");
        list1.addLast("9");

        System.out.println(list1);
        list1.remove("B");
        list1.remove(1);
        list1.removeFirst();
        list1.removeLast();
        System.out.println(list1);*/

      /*  leetCode.RemoveDuplicatesFromSortedArray r = new leetCode.RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));*/

        /*leetCode.RemoveElement removeElement = new leetCode.RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{3, 2, 2, 3}, 4));*/

       /* leetCode.Implement imp = new leetCode.Implement();
        System.out.println(imp.strStr("hello", "ll"));*/

       /* leetCode.SearchInsertPosition s = new leetCode.SearchInsertPosition();
        System.out.println(s.searchInsert(new int[]{1, 3, 5, 6}, 7));*/

      /*  leetCode.MaximumSubarray m = new leetCode.MaximumSubarray();
        System.out.println(m.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));*/

       /* leetCode.LengthOfLastWord l = new leetCode.LengthOfLastWord();
        System.out.println(l.lengthOfLastWord("luffy is still joyboy"));*/

      /*  leetCode.PlusOne p = new leetCode.PlusOne();
        int[] ints = p.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }*/

    }
}

/*
class MergeLists {
    leetCode.ListNode head;
    public void addToTheLast(leetCode.ListNode node) {
        if (head == null) {
            head = node;
        } else {
            leetCode.ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    */
/* Method to print linked list */
/*

    void printList() {
        leetCode.ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}*/
