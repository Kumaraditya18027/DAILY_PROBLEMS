/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> al= new ArrayList<>();
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null || temp2!=null)
        {
            if(temp1!=null)
            {
                al.add(temp1);
                temp1=temp1.next;
            }
            if(temp2!=null)
            {
            al.add(temp2);
            temp2=temp2.next;
            }
        }
        int n=al.size();
        int flag=0;
        Set<ListNode> st=new HashSet<ListNode>();
        for(int i=0;i<n;i++)
        {
            if(st.contains(al.get(i)))
            {
                flag=1;
                return al.get(i);
            }
            else
            st.add(al.get(i));
        }
        return null;
        
    }
}