class Solution {
public:
    int minSubarray(vector<int>& nums, int p) {
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        int rem=sum%p;
        if(rem==0)return 0;
        unordered_map<int,int>prefixMod;
        prefixMod[0]=-1;
        long long prefixSum=0;
        int miniLength=nums.size();
        for(int i=0;i<nums.size();i++)
        {
            prefixSum+=nums[i];
            int currentMod=prefixSum%p;
            int targetMod=(currentMod-rem+p)%p;
            if(prefixMod.find(targetMod)!=prefixMod.end())
            {
                miniLength=min(miniLength,i-prefixMod[targetMod]);
            }
            prefixMod[currentMod]=i;
        }
        return miniLength ==nums.size()?-1:miniLength;

    }
};