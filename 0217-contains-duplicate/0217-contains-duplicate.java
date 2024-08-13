class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i])&& mp.get(nums[i])>=1)
            return true;
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        return false;
    }
}