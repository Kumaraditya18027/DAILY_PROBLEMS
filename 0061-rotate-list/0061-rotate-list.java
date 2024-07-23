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
    public static int findLength(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0|| head==null || head.next==null)
        return head;
        int n=findLength( head);
        int tr_k=n-(k%n);
        ListNode temp=head;
        ListNode end=null;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        temp=head;
        for(int i=1;i<tr_k;i++)
        {
            temp=temp.next;
        }
        end=temp.next;
        temp.next=null;
        head=end;
        return head;


    }
}