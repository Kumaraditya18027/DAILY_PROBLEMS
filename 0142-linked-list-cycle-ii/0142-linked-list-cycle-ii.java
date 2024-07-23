/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && slow!=null)
        {
            fast=fast.next;
            if(fast!=null)
            fast=fast.next;
            slow=slow.next;
            if(slow==fast)
            {
                break;
            }
        }
        if(fast==null)
        return null;
        slow=head;
        int pos=0;
        while(fast!=slow)
        {
            slow=slow.next;
            //if(fast.next!=null)
            fast=fast.next;
            pos++;
        }
        return slow;
        
    }
}