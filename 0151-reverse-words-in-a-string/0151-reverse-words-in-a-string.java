class Solution {
  
    public String reverseWords(String s) {
        Stack<String> st=new Stack<String>();
        s=s.trim();
        String str="";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                st.push(str);
                str="";
            }
            else
            {
                str+=s.charAt(i);   
            }
        }
        st.push(str);
        while(st.size()!=1)
        {
            if(st.peek()!="")
             ans+=st.peek()+" ";
             st.pop();
        }
        ans+=st.peek();
        return ans;

        
        
    }
}