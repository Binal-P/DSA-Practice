package Day17;

import Day15.ListNode;

public class DeleteNthNodeFromEndOflinked {
    //Given the head of a linked list, remove the nth node from the end of the list and return its head.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyStart = new ListNode();
        dummyStart.next = head;
        ListNode fast = dummyStart;
        ListNode slow = dummyStart;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyStart.next;
    }
}
