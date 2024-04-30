//Optimal Aproach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans=new ArrayList<>();
    int n=nums.length;
    for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1])
        continue;
        int j=i+1;
        int k=n-1;
        while(j<k)
        {
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0)
            {
                j++;
            }
            else if(sum>0)
            k--;
            else{
               List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[j]);
               ans.add(temp);
               while(k>0 && nums[k]==nums[k+1])k--;
               
            }
        }
    }

        
    }
}