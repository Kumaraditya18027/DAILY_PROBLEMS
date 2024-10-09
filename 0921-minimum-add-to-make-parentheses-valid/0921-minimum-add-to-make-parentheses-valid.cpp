class Solution {
public:
    int minAddToMakeValid(string s) {
        stack<char>st;
        int open=0;
        int mismatch=0;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='(')
            {
                open++;
                //st.push(s[i];
            }
            else
            {
                if(open>0)
                open--;
                else
                mismatch++;
            
                //st.top()
            }
        }
        return open+mismatch;
    }
};