class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int right=0;int left=0;
        vector<int>hash1(26,0);
        vector<int>hash2(26,0);
        if(s1.length()>s2.length())
        return false;
        while(right<s1.length())
        {
            hash1[s1[right]-'a']++;
            hash2[s2[right]-'a']++;
            right++;
        }
        //right--;
        while(right<s2.length())
        {
            if(hash1==hash2)
            return true;
            //right++;
            if(right!=s2.length())
            hash2[s2[right]-'a']++;
            hash2[s2[left]-'a']--;
            left++;right++;
        }
        return false;
    }
};