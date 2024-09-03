class Solution {
public:
    int digitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int r=num%10;
            sum+=r;
            num=num/10;
        }
        return sum;
    }
    int getLucky(string s, int k) {
        
        string temp_ans="";
        int res=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int temp_num=s[i]-'a'+1;
            while(temp_num>0)
            {
                res+=temp_num%10;
                temp_num/=10;
            }
            
        }
        while(k-1>0)
        {
           res=digitSum(res);
           k--;
        }
        return res;

    }
};