class Solution {
    public String removeOuterParentheses(String s) {
        int bal=0;
        int n=s.length();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                if(bal>0)
                {
                    temp.append('(');
                }
                bal++;
            }
            else if(s.charAt(i)==')')
            {
                bal--;
                if(bal>0)
                {
                    temp.append(')');
                }
            }
        }
        return temp.toString();
    }
}