class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int n1=nums1.length,n2=nums2.length;
       int i=0,j=0;
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       ArrayList<Integer> ans=new ArrayList<>();
       while(i<n1 && j<n2)
       {
          if(nums1[i]<nums2[j])
          {
            i++;
          }
          else if(nums1[i]==nums2[j])
          {
            //Integer temp=(Integer)nums1[i];
            if(ans.isEmpty()|| !ans.get(ans.size()-1).equals(nums1[i]))
            ans.add(nums1[i]);
            i++;j++;
          }
          else
          {
            j++;
          }
       }
       int[] a=new int[ans.size()];
       for(int l=0;l<ans.size();l++)
       { 
        a[l]=ans.get(l);
       }
        return a;     
    }
}