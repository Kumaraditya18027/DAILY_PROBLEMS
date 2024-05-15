class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> result=new ArrayList<>();
        for(int row=1;row<=n;row++)
        {
            List<Integer>temp=new ArrayList<>();
            int ans=1;
            temp.add(ans);
            for(int i=1;i<row;i++)
            {
                ans=ans*(row-i);
                ans=ans/i;
                temp.add(ans);
            }
            result.add(temp);
        }
        return result;
    }
}