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
    int sizelkd(ListNode *head)
    {
        ListNode *temp=head;
        int count=0;
        while(temp!=nullptr)
        {
            count++;
            temp=temp->next;
        }
        return count;
    }
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
      int n = sizelkd(head);
        vector<ListNode*> ans(k, nullptr);
        int jump = n / k;
        int remaining = n % k;
        ListNode *curr = head;

        for (int i = 0; i < k; i++) {
            if (curr == nullptr) break;

            ans[i] = curr;
            int currSize = jump + (remaining > 0 ? 1 : 0);
            remaining--;

            for (int j = 1; j < currSize; j++) {
                if (curr != nullptr) {
                    curr = curr->next;
                }
            }

            if (curr != nullptr) {
                ListNode *nextPart = curr->next;
                curr->next = nullptr;
                curr = nextPart;
            }
        }

        return ans;
    }
};