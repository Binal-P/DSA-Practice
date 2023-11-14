package Day15;

public class ReverseLinkList {
    //Given the head of a singly linked list, reverse the list, and return the reversed list.
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode previous = null;
            ListNode current = head;
            while(current!=null ){
                ListNode next = current.next;
                current.next = previous;
                previous = current;
                current=next;
            }
            return previous;
        }
    }
}
