class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length<=1)
        return "";
        String first=strs[0];
        String last=strs[strs.length-1];
        String ans="";
        int n=Math.min(first.length(),last.length());
        for(int i=0;i<n;i++)
        {
            char temp_f=first.charAt(i);
            char temp_l=last.charAt(i);
            if(temp_f==temp_l)
            {
                ans+=temp_f;
            }
            else
            break;
        }
        return ans;
    }
}