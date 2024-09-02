#define ll long long
class Solution {
public:
    int chalkReplacer(vector<int>& chalk, int k) {
        ll req_chalk=0;
        int n=chalk.size();
        for(int x:chalk)
        req_chalk+=(ll)x;
        ll chalk_left=(ll)k%req_chalk;
        for(int i=0;i<n;i++)
        {
            if(chalk[i]>chalk_left)
            return i;
            else
            chalk_left-=(ll)chalk[i];
        }
        return -1;

    }
};