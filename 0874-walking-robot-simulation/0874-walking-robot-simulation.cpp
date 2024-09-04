class Solution {
public:
    int robotSim(vector<int>& commands, vector<vector<int>>& obstacles) {
       set<vector<int>> st;
       for(vector<int>&temp:obstacles) 
       {
         st.insert(temp);
       }
       vector<vector<int>>directions={
        {0,1},{1,0},{0,-1},{-1,0}
       };
       int x=0,y=0,direction=0,maxDistance=0;
       for(int i=0;i<commands.size();i++)
       {
            if(commands[i]==-2)
            direction=(direction+3)%4;
            else if(commands[i]==-1)
            direction=(direction+1)%4;
            else
            {
                int step=0;
                while(step<commands[i] &&(st.contains({x+directions[direction][0],y+directions[direction][1]})==false))
                {
                    x+=directions[direction][0];
                    y+=directions[direction][1];
                    step++;
                }
            }
            maxDistance=max(maxDistance,x*x+y*y);
       }
       return maxDistance;

    }
};