class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int x=target-num;
            if(mp.containsKey(x)){
                    ans[0]=mp.get(x);
                    ans[1]=i;
            }
            mp.put(nums[i],i);
        }
        return ans;
        
    }
}