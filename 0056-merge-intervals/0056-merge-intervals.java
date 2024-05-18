class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }
        });
        int n=arr.length;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(ans.isEmpty()|| arr[i][0]>ans.get(ans.size()-1).get(1))
            ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            //This is the case in which the end of the current interval is greater than the 
            //start of the next interval.
            else
            {
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }
        }
        int result[][]=new int[ans.size()][2];
        for(int j=0;j<ans.size();j++){
            result[j][0]=ans.get(j).get(0);
            result[j][1]=ans.get(j).get(1);
        }
        return result;
      
        
    }
}