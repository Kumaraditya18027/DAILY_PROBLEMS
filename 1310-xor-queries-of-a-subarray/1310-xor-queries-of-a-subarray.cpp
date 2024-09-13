class Solution {
public:
    vector<int> xorQueries(vector<int>& arr, vector<vector<int>>& queries) {
        vector<int>ans;
        int n=queries.size();
        for(int i=0;i<n;i++)
        {
            int first=queries[i][0];
            int second=queries[i][1];
            int xoro=0;
            for(int i=first;i<=second;i++)
            {
                xoro=xoro^arr[i];
            }
            ans.push_back(xoro);
        }
        return ans;
    }
};