class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        unordered_map<char,int>mp;
        for(char x:allowed)
        {
            mp[x]++;
        }
        int count=0;
        for(string& w:words)
        {
           int consistent=1;
           for(char c:w)
           {
                if(!mp.count(c))
                {
                    consistent=0;
                    break;
                }
           }
           count+=consistent;

        }
        return count;
    }
};