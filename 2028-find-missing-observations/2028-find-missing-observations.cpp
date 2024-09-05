class Solution {
public:
    vector<int>solve(vector<int>&ans,int res,int n)
    {
        int i=0;
        int rem=res/n;
        while(res>0)
        {
             if(i<n-1)
             ans[i++]=rem;
             else if(i==n-1)
             ans[i++]=res;
             res=res-rem;
        }
        return ans;
    }
    vector<int> missingRolls(vector<int>& rolls, int mean, int n) {
        int m=rolls.size();
        int sum=0;
        for(int x:rolls)
        sum+=x;
        int residual=(mean*(n+m))-sum;
        if(residual>n*6 || residual <0)return {};
        vector<int>ans(n,0);
        ans=solve(ans,residual,n);
        return ans;

    }
};