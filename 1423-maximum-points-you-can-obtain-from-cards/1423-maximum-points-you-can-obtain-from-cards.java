class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,max_sum=0;
        int right=cardPoints.length-1;
        for(int i=0;i<=k-1;i++)
        lsum+=cardPoints[i];
        max_sum=Math.max(max_sum,lsum+rsum);
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[right];
            right--;
            max_sum=Math.max(max_sum,lsum+rsum);
        }
        return max_sum;
    }
}