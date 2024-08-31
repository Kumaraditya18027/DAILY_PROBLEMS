class Solution {
public:
    string minWindow(string s, string t) {
        int n=s.length(), m=t.length(),s_index=-1,min_len=INT_MAX,l=0,r=0;
        int hash[256]={0};
        int count=0;
        for(int i=0;i<m;i++)
        hash[t[i]]++;
        while(r<n)
        {
            if(hash[s[r]]>0)
            {
                count++;
            }
            hash[s[r]]--;
            //Valid window is obtained, Now we shrink by increasing l
            while(count==m)
            {
                if(r-l+1<min_len)
                {
                    min_len=r-l+1;
                    s_index=l;
                }
                hash[s[l]]++;
                if(hash[s[l]]>0)count--;
                l++;
            }
            r++;
        }
        return s_index==-1?"":s.substr(s_index,min_len);
        
    }
};