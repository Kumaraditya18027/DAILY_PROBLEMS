class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        //char temp[]=s.toCharArray();
        int maxi=0;
        int l=0,r=0;
        for( r=0;r<s.length();r++)
        {
            if(st.contains(s.charAt(r)))
            {
                while(l<r && st.contains(s.charAt(r)))
                {
                    st.remove(s.charAt(l));
                    l++;
                }
            }
                st.add(s.charAt(r));
                maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}