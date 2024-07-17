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
    public boolean isPalindrome(ListNode head) {
    ListNode temp=head;
    List<Integer>al=new ArrayList<>();
    while(temp!=null)
     {
        al.add(temp.val);
        temp=temp.next;
     }
    int left=0,right=al.size()-1;
    while(left<=right)
    {
        if(al.get(left)==al.get(right))
        {
            left++;
            right--;
        }
        else
        return false;
    }
    return true;


    }
}