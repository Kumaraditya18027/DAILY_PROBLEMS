class Solution {
public:
    void splitstring(string &str,char del,vector<string>&hold)
    {
        stringstream ss(str);
        string item;
        while(getline(ss,item,del))
        {
            hold.push_back(item);
        }
    }
    vector<string> uncommonFromSentences(string s1, string s2) {
      vector<string>hold;
      vector<string>ans;
      splitstring(s1,' ',hold);
      splitstring(s2,' ',hold); 
      unordered_map<string,int>mp;
      int n=hold.size();
      for(int i=0;i<n;i++)
      {
            mp[hold[i]]++;
      }
      for(auto &it:mp)
      {
        if(it.second==1)
        ans.push_back(it.first);
      }
      return ans;
    }
};