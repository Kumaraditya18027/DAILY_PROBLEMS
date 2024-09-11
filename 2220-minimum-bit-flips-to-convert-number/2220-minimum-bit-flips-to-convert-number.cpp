class Solution {
public:
    string bitconversion(int n){
        string ans;
        while(n>0)
        {
            if((n&1)==1)
            ans+='1';
            else
            ans+='0';
            n>>=1;
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
    int minBitFlips(int start, int goal) {
        string st=bitconversion(start);
        string en=bitconversion(goal);
        int count=0;
        int maxLength = max(st.length(), en.length());
        st.insert(st.begin(), maxLength - st.length(), '0'); 
        en.insert(en.begin(), maxLength - en.length(), '0'); 
        for(int i=0;i<maxLength;i++)
        {
            if(st[i]!=en[i])
            count++;
        }
        /*if((st.length()-en.length())!=0)
        {
            count=count+ abs((int)(st.length()-en.length()));
        }*/
        return count;
    }
};