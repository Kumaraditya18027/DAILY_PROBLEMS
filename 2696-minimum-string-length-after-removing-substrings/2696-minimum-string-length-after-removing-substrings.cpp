class Solution {
public:
    int minLength(string s) {
     int n=s.length();
     int count=0;
     stack<char>st;
     for(int i=0;i<n;i++)
     {
        if(st.empty())
        {
            st.push(s[i]);
            continue;
        }
        else if(s[i]=='B' && st.top()=='A')
        {
            st.pop();
        }
        else if(s[i]=='D' && st.top()=='C')
        st.pop();
        else
        st.push(s[i]);
     }
     return st.size();
    }
};