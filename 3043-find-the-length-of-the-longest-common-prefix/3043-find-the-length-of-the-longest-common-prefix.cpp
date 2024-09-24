class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        unordered_map<string,int>mp;
        for(int num:arr1){
            string str_num=to_string(num);
            string prefix="";
            for(char ch:str_num){
                prefix+=ch;
                mp[prefix]++;
            }
        }
        int max_len=0;
        for(int num:arr2)
        {
            string str_num=to_string(num);
            string prefix="";
            for(char ch:str_num)
            {
                prefix+=ch;
                if(mp.count(prefix))
                {
                    max_len=max(max_len,static_cast<int>(prefix.length()));
                }
            }
        }
        return max_len;
        }
        
    
};