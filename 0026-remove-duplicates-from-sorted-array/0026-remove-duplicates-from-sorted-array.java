class Solution {
    public int removeDuplicates(int[] nums) {
        //Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new)
        /*Integer[] newarray=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> lst=Arrays.asList(newarray);
        ArrayList<Integer> al=new ArrayList<>(lst);
        for(int i=0;i<al.size()-1;i++)
        {
            if(al.get(i)==al.get(i+1))
            al.remove(al.get(i));
        }
        return al.size();*/
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}