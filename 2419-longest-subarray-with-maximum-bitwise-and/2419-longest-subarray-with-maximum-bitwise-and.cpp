class Solution {
public:
    int longestSubarray(vector<int>& nums) {
       int m=max_element(nums.begin(),nums.end())-nums.begin();
       int maxlen=0;int x=nums[m];
       int n=nums.size();
       for(int i=m;i<n;i++)   
       {
            int count=0;
            while(i<n && nums[i]==x)
            {
                i++;
                count++;
            }
            maxlen=max(maxlen,count);
       }
       return maxlen;
    }
};