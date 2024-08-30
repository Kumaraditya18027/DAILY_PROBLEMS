class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        mp[0]=1;
        int n=nums.size();
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
                sum+=nums[i];
                if(mp.find(sum-k)!=mp.end())
                {
                    count=count+mp[sum-k];
                }
                mp[sum]++;
        }
        return count;
        
    }
};