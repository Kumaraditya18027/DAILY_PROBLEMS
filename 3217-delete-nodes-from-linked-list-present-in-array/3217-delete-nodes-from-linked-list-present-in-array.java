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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> st=new HashSet<Integer>();
        for(int n:nums)
        {
            st.add(n);
        }
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode curr=temp;
        while(curr.next!=null)
        {
           if(st.contains(curr.next.val))
           {
               curr.next=curr.next.next; 
           }
            else
            curr=curr.next;
        
        }
        return temp.next;
        
        
        
        
    }
}