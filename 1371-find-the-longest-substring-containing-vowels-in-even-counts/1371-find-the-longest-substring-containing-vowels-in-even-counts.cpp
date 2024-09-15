class Solution {
public:
    int findTheLongestSubstring(string s) {
        unordered_map<int,int>mp;
        mp[0]=-1;
        int cnt=0;
        int n=s.length();
        int max_len=0;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='a'||s[i]=='e'|| s[i]=='i' || s[i]=='o' ||s[i]=='u')
            {
                cnt=cnt^(1<<((int)(s[i]-'a')));
            }
            if(mp.count(cnt))
            {
                max_len=max(max_len,i-mp[cnt]);
            }
            else
            {
                mp[cnt]=i;
            }
        }
        return max_len;

    }
};