//Optimized approach Time: O(N) Space :O(N)

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        int l=0,r=0;
        int max_len=0;
        int n=s.length();
        while(r<n)
        {
            if(mp.containsKey(s.charAt(r)))
            l=Math.max(mp.get(s.charAt(r))+1,l);
            mp.put(s.charAt(r),r);
            max_len=Math.max(max_len,r-l+1);
            r++;
        }
        return max_len;
    }
}