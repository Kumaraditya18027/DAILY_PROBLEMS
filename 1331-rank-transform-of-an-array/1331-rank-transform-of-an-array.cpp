class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<int>temp=arr;
        sort(temp.begin(),temp.end());
        vector<int>result;
        map<int,int>mp;
        mp[temp[0]]=1;
        for(int i=1;i<temp.size();i++)
        {
            if(temp[i]>temp[i-1]){
                mp[temp[i]]=mp[temp[i-1]]+1;
            }
            else{
                mp[temp[i]]=mp[temp[i-1]];
            }
        }
        for(int x:arr)
        {
            result.push_back(mp[x]);
        }
        return result;
    }
};