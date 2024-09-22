class Solution {
public:
    int getnum(long tree1,long n)
    {
      long tree2=tree1+1;
      long iterations=0;
      while(tree1<=n)
      {
         iterations+=min(n+1,tree2)-tree1;
         tree1*=10;
         tree2*=10;
      }   
      return iterations;
    }
    int findKthNumber(int n, int k) {
       long num=1;
       n=(long)n;
       for(int i=1;i<k;)
       {
          int req=getnum(num,n);
          if(i+req<=k)
          {
            i+=req;
            num++;
          }
          else{
            i++;
            num*=10;
          }
       }
       return (int)num;
    }
};