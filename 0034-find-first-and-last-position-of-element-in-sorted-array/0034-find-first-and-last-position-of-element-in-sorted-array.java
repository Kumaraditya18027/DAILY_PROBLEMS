class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                if(flag==0)
                ans[0]=i;
                ans[1]=i;
                flag=1;
            }

        }
        return ans;
    }
}