class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        for(int i=0;i<nums.size();i++)
        {
            nums[i]=(nums[i]%2==0)?0:1;
        }
        unordered_map<int,int>mp;
        mp[0]++;
        int count=0;
        int sum=0;
        for(int i=0;i<nums.size();i++)
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