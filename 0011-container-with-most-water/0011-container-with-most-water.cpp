class Solution {
public:
    int maxArea(vector<int>& height) {
        int l=0,r=height.size()-1;
        int maxi=-1;
        while(l<r)
        {
            maxi=max(maxi,(r-l)*min(height[l],height[r]));
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return maxi;
        
    }
};