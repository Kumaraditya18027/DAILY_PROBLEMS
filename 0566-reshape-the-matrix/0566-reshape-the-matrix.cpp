class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        int n=mat.size();
        int m=mat[0].size();
        if(r*c!=n*m)return mat;
        vector<vector<int>>matrix;
        int l=0;
        vector<int>temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                temp.push_back(mat[i][j]);
            }
        }
        for(int i=0;i<r;i++)
        {
            vector<int>intermediate;
            for(int j=0;j<c;j++)
            {
                intermediate.push_back(temp[l++]);
            }
            matrix.push_back(intermediate);
        }
        return matrix;
    }
};