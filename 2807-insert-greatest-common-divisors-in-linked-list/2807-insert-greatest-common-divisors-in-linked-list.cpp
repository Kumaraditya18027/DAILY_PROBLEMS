/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
            
            ListNode *temp=head;
            while(temp!=nullptr &&temp->next!=nullptr)
            {
                ListNode* first=temp;
                ListNode* second=temp->next;
                ListNode *temp_ins=new ListNode(gcd(first->val,second->val));
                temp_ins->next=first->next;
                first->next=temp_ins;
                temp=temp_ins->next;
            }
            return head;

    }
};