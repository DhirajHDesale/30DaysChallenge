class Solution {
    static int isPerfectNumber(long N) {
  long sum = 0L;
        for(int i=1;i<Math.sqrt(N);i++)
        {
            if(N%i==0)
            {
                sum = sum + i;
                long a = N/i;
                if(N/i!=N)
                sum = sum + a;
            }
        }
        if(sum == N)
        {
            return 1;
        }
        else
        return 0;
         
       
    }
};