class Solution {
    public boolean isPalindrome(int x) {
         long temp=x;
         long res=0;
         if(x<0)
         return false;
         while(temp!=0)
         {
            int r=(int)(temp%10);
            res=res*10+r;
            temp=temp/10;
         }
         return res==x;


    }
}