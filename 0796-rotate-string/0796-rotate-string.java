class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        String temp="";
        String t=s;
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
               temp=t.substring(i,n)+t.substring(0,i);
               if(temp.equals(goal))
               return true;
               temp="";
               t=s;
        }
        return false;
        
    }
}