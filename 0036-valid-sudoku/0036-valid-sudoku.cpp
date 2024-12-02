class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set<char>r[9];
        unordered_set<char>c[9];
        unordered_set<char>b[9];
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                continue;
                char value=board[i][j];
                int bi=(i/3)*3+(j/3);
                if(r[i].count(value)||c[j].count(value)||b[bi].count(value))
                return false;
                r[i].insert(value);
                c[j].insert(value);
                b[bi].insert(value);
            }
        }
            return true;
    }
};