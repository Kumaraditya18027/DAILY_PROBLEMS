class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int last=s.length()-1;
        while(start<=last)
        {
            char cf=s.charAt(start);
            char cl=s.charAt(last);
            if(!Character.isLetterOrDigit(cf))
            {
                start++;
                continue;
            }
            else if(!Character.isLetterOrDigit(cl))
            {
                last--;
                continue;
            }
            else
            {
                if(Character.toLowerCase(cf)!=Character.toLowerCase(cl))
                return false;
                else
                {
                    start++;last--;
                }
            }
        }
        return true;
    }
}