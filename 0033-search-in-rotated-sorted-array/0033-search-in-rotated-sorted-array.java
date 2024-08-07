class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        //Arrays.sort(nums);
        while(l<=h)
        {
            int mid=(l+h)/2;
           if(nums[mid]==target)
           {
            return mid;
           }
           else if(nums[l]<=nums[mid])
           {
            if(target>=nums[l] && target<=nums[mid])
            h=mid-1;
            else
            l=mid+1;
           }
           else
           {
            if(target<=nums[h] && target>=nums[mid])
            l=mid+1;
            else 
            h=mid-1;
           }

        }
        return -1;
    }
}